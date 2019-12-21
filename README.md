# Graph Algorithms
##### Single-source shortest path and Minimum Spanning Tree (MST)

## 1. Single-source shortest path
Single source shortest path refers to the problem of finding a path between two nodes or vertices in such a way that the sum of weights of its constituent edges is minimized. Shortest path can be defined for graphs irrespective of being directed or undirected. Here we are implementing Dijkstra’s algorithm for finding shortest path between source and all other vertices of the graph.

#### 1.1. Dijkstra’s algorithms
This algorithm maintains two queues, one of the visited nodes and the other of the non-visited ones. It initializes the start node with 0 and all the other nodes with infinity. Now selecting the least cost edge, the pointer moves from one node to the other, calculating the cost each time and comparing the cost to find the least one. In the end when all the nodes have been traversed, the nodes in the visited list are displayed to show the least cost path between every node.

#### 1.2. Data structure
**Main:** Dijkstra’s algorithm is implemented using priority queue data structure. The user is first asked to enter the path of the text file. The main class takes input from a text file using buffered reader and inputs it in a queue. It also asks the user to select either single-source shortest path or minimum spanning tree to be implemented on the provided file. Then it calculates and displays number of vertices, edges and type of graph, it requests for the source vertex in case of single source shortest path and sends it to graph function for calculating the paths.

**Edge:** consists of strings v1 and v2 which store the end vertices of an edge and weight variable is used for storing weight of the edges.

**Graph:** uses hash map for mapping vertex names to vertex objects built from the set of edges and thereby creates a graph for set of vertices passed by the main class. It also uses priority queue to store the vertices by adding v one by one. This function is also responsible for printing paths from source vertex to other vertices.

**Vertex:** this function is responsible for comparing costs and printing the least costing path between two vertices.

#### 1.3. Runtime
O(E log V)

#### 1.4. Instructions
On running the program, it asks for a path to locate the file, so place the input file in a separate folder and pass the path, for example, C:\Users\saloni\Desktop\New folder\inputFile3.txt. Now, enter the option between Dijkstra’s (for single-source shortest path) and Kruskal’s algorithm (for minimum spanning tree). In case of Dijkstra’s it asks for source node to calculate the shortest paths. On entering the vertex, the output can be seen on the screen.

## 2. Minimum Spanning Tree
Minimum spanning tree refers to a tree structure which comprises of a subset of edges of the entire weighted connected undirected graph such that all the vertices are connected together without cycles and with minimum edge weight. Various algorithms exist for calculating the minimum spanning tree but here we are implementing Kruskal algorithm for it.

#### 2.1. Kruskal’s algorithm
For Kruskal’s algorithm is a greedy algorithm. In this algorithm, first, all the edges are sorted in a non-decreasing order of their weight. Then we pick the edge with least edge weight. If that edge forms a cycle with the spanning tree formed till now, the edge is discarded else, the edge is included in the spanning tree. This process is repeated till V-1 edges are there in the spanning tree.

####  2.2. Data structure

**Main:** Dijkstra’s algorithm is implemented using priority queue data structure. The user is first asked to enter the path of the text file. The main class takes input from a text file using buffered reader and inputs it in a queue. It also asks the user to select either single-source shortest path or minimum spanning tree to be implemented on the provided file. Then it calculates and displays number of vertices, edges and type of graph, it requests for the source vertex in case of single source shortest path and sends it to graph function for calculating the paths.

**Edge:** consists of strings v1 and v2 which store the end vertices of an edge and weight variable is used for storing weight of the edges.

**Vertex:** this function is responsible for comparing costs and printing the least costing path between two vertices.

**Kruskal:** The function uses hash maps for storing parent and rank information. The edges are sorted based on their edge weight. The edge with least weight is selected and put in an array list to form a set of edges after checking the formation of cycles. Once all the edges have been checked and the spanning tree consists of V-1 edges, the algorithm stops and prints are the edges that form the minimum spanning tree.

#### 2.3. Runtime
O(E log V) or O(E log E)

#### 2.4. Instructions
On running the program, it asks for a path to locate the file, so place the input file in a separate folder and pass the path, for example, C:\Users\saloni\Desktop\New folder\inputFile3.txt. Now, enter the option between Dijkstra’s (for single-source shortest path) and Kruskal’s algorithm (for minimum spanning tree). In case of Kruskal it prints the edges and cost on selecting the option.
