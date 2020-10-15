package yaksha;

import static org.mockito.Mockito.mock;
import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestMainClass {

	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testGraph() throws Exception {
		int[][] result = new int[6][6];
		int expectedResult = 1;
		GraphAdjacencyMatrix graph;
		int v = 5;
		int e = 7;
		graph = new GraphAdjacencyMatrix(v);
		Graph graph1 = new Graph(1, 1, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(2, 3, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(3, 4, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(4, 5, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(3, 5, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(1, 4, 1);
		graph.makeEdge(graph1);
		graph1 = new Graph(2, 4, 1);
		graph.makeEdge(graph1);
		for (int i = 1; i <= v; i++) {
			for (int j = 1; j <= v; j++) {
				Graph graph2 = new Graph(i, j);
				result[i][j] = graph.getEdge(graph2);
			}
		}
		GraphAdjacencyMatrix test = mock(GraphAdjacencyMatrix.class);
		Mockito.when(test.getEdge(graph1)).thenReturn(expectedResult);
		yakshaAssert(
				currentTest(), (result[1][1] == 1 && result[2][3] == 1 && result[3][4] == 1 && result[4][5] == 1
						&& result[3][5] == 1 && result[1][4] == 1 && result[2][4] == 1 ? true : false),
				businessTestFile);
	}
}