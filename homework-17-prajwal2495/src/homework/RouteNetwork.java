package homework;
import java.util.*;

public class RouteNetwork {
    public static void main(String[] args)  {
        WeightedAdjacencyGraph<String> weightedAdjacencyGraph = new WeightedAdjacencyGraph<>();

        weightedAdjacencyGraph.addValue("ROC");
        weightedAdjacencyGraph.addValue("DCA");
        weightedAdjacencyGraph.addValue("ATL");
        weightedAdjacencyGraph.addValue("MCO");
        weightedAdjacencyGraph.addValue("ORD");
        weightedAdjacencyGraph.addValue("PDX");
        weightedAdjacencyGraph.addValue("SFO");
        weightedAdjacencyGraph.addValue("LAX");

        /**
         * ROC --> ORD
         * ROC --> ATL
         * ROC --> MCO
         * ROC --> DCA
         */
        weightedAdjacencyGraph.connect("ROC","ORD",15);
        weightedAdjacencyGraph.connect("ROC","ATL",22);
        weightedAdjacencyGraph.connect("ROC","MCO",24);
        weightedAdjacencyGraph.connect("ROC","DCA",10);

        /**
         * DCA --> SFO
         * DCA --> LAX
         */
        weightedAdjacencyGraph.connect("DCA","SFO",25);
        weightedAdjacencyGraph.connect("DCA","LAX",36);

        /**
         * ATL --> LAX
         */
        weightedAdjacencyGraph.connect("ATL","LAX",31);

        /**
         * MCO --> LAX
         */
        weightedAdjacencyGraph.connect("MCO","LAX",31);

        /**
         * ORD --> PDX
         * ORD --> SFO
         * ORD --> LAX
         */
        weightedAdjacencyGraph.connect("ORD","PDX",26);
        weightedAdjacencyGraph.connect("ORD","SFO",37);
        weightedAdjacencyGraph.connect("ORD","LAX",35);

        /**
         * LAX --> SFO
         * LAX --> PDX
         * LAX --> ORD
         * LAX --> DCA
         * LAX --> ATL
         * LAX --> MCO
         */
        weightedAdjacencyGraph.connect("LAX","SFO",10);
        weightedAdjacencyGraph.connect("LAX","PDX",21);

        /**
         * SFO --> LAX
         * SFO --> ORD
         * SFO --> DCA
         */
        weightedAdjacencyGraph.connect("SFO","LAX",10);
        weightedAdjacencyGraph.connect("SFO","ORD",37);
        weightedAdjacencyGraph.connect("SFO","DCA",25);

        /**
         * PDX --> LAX
         * PDX --> ORD
         */
        weightedAdjacencyGraph.connect("PDX","LAX",21);
        weightedAdjacencyGraph.connect("PDX","ORD",26);



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the origin airport code");
        String origin = scan.nextLine();
        System.out.println("Enter destination airport code:");
        String destination = scan.nextLine();

        System.out.println("Shortest path to "+destination+" from "+origin+" is: "+weightedAdjacencyGraph.dijkstrasShortestPath(origin,destination));


    }
}
