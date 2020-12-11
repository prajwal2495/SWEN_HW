package HomeWork;

import java.util.*;

public class KnightMovements {
    private AdjacencyGraph<String> gridGraph;
    private int gridSize;
    private String startingCoordinate;
    private String endingCoordinate;

    public KnightMovements(int gridSize,String startingCoordinate, String endingCoordinate) {
        this.gridGraph = new AdjacencyGraph<>();
        this.gridSize = gridSize;
        this.startingCoordinate = startingCoordinate;
        this.endingCoordinate = endingCoordinate;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter grid size :");
        String[] gridSize = scn.nextLine().split("\\s+");
        int size = Integer.parseInt(gridSize[0]);

        System.out.println("Enter start and end coordinates : ");
        String[] points = scn.nextLine().split("\\s+");
        int startRow = Integer.parseInt(points[0]);
        int startCol = Integer.parseInt(points[1]);
        int endRow = Integer.parseInt(points[2]);
        int endCol = Integer.parseInt(points[3]);



        String start = startRow+","+startCol;
        String end = endRow+","+endCol;

        KnightMovements knightMovements = new KnightMovements(size,start,end);

        knightMovements.gridGraph.addValue(start);
        knightMovements.gridGraph.addValue(end);

        Vertex<String> startingVertex = new Vertex<>(start);
        Vertex<String> destinationVertex = new Vertex<>(end);

        Queue<Vertex<String>> queue = new LinkedList();
        Set<Vertex<String>> visited = new HashSet<>();

        queue.add(startingVertex);
        visited.add(startingVertex);
        visited.add(destinationVertex);

        int flag = 0;

        while(queue.size() > 0){
            flag = 0;
            Vertex<String> findNeighbors = queue.poll();
            Set<Vertex<String>> vertices =  knightMovements.createNeighbors(findNeighbors);
            if(destinationVertex.getValue().equals(findNeighbors.getValue())){
                flag = 0;
            }

            for (Vertex<String> vertex : vertices){
                for(Vertex<String> v : visited){
                    if(v.getValue().equals(vertex.getValue())){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    visited.add(vertex);
                    queue.add(vertex);
                }
                flag = 0;
            }
        }

        System.out.println("BFS:"+knightMovements.gridGraph.breadthFirstSearch(start,end));
        System.out.println("BFP:"+knightMovements.gridGraph.breadthFirstPath(start,end));

    }


    public Set<Vertex<String>> createNeighbors(Vertex<String> tile){
        int[] possibleNextRow = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] possibleNextColumn = {-1, 1 , 1, -1, 2, -2, 2, -2};

        String[] tileCoordinates = tile.getValue().split(",");
        int x = Integer.parseInt(tileCoordinates[0]);
        int y = Integer.parseInt(tileCoordinates[1]);
        String tileVertexString = x+","+y;

        Vertex<String> tileVertex = new Vertex<>(tileVertexString);
        Set<Vertex<String>> allNeighbors = new HashSet<>();

        if(x < 0 || y < 0 || x > this.gridSize || y > this.gridSize ){
            return null;
        }else {
            for (int i = 0; i < 8; i++) {
                int nextPossibleRowCoordinate = x + possibleNextRow[i];
                int nextPossibleColumnCoordinate = y + possibleNextColumn[i];

                if (nextPossibleRowCoordinate < 0 || nextPossibleColumnCoordinate < 0
                        || nextPossibleRowCoordinate >= this.gridSize || nextPossibleColumnCoordinate >= this.gridSize) {
                    continue;
                } else {
                    String nextNeighbor = nextPossibleRowCoordinate + "," + nextPossibleColumnCoordinate;
                    Vertex<String> neighborVertex = new Vertex<>(nextNeighbor);

                    this.gridGraph.addValue(nextNeighbor);
                    //tileVertex.addNeighbor(neighborVertex);
                    this.gridGraph.connectUndirected(tileVertexString, nextNeighbor);
                    allNeighbors.add(neighborVertex);
                    //allNeighbors.add(tileVertex);
                }
            }
        }
        return allNeighbors;
    }
}
