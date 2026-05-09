# Yermakov Ilya IT 2503

<img width="663" height="567" alt="изображение" src="https://github.com/user-attachments/assets/892fb327-1eeb-4acb-81d7-d90f2a7f39de" />

# Analysis Questions 

1. How does graph size affect BFS and DFS performance?
   The size of graph have affect on both search perfomance this increas complexity of algorithm. If I increas the number of nodes and edges in 10 times complexity also will in 10 times greater

2. Which traversal is faster in your experiments?
   Usually DSF is faster than BSF because it uses recursion and it works with stack and with CPU exactly but BSF works with LinkedList it just need more time because it create queue.

3. Do results match the expected complexity O(V + E)?
   Yes, they do. Experiments show that time increases predictably. There are no sharp jumps (for example, by a factor of 100 when the graph is only twice as large), which are common with poor algorithms. This confirms that both methods traverse the graph efficiently, without unnecessary round trips.

4. How does graph structure affect traversal order?
   DFS work in inner of graph if your graph will be very deep is need more time for traversal and for BSF if graph will have a lot of neighbors it need more time

5. When is BFS preferred over DFS?
  BFS king when you need to find the shortest path in a regular graph. For example the shortest way to find market and so on.

6. What are the limitations of DFS?
   DFS can't find the shortest way and it can find the most longer way even the goal been in next node. The second disadv. is stack overflow risk, if graph is too deep recursion will break the memory, BFS does not have this problem because it store data in common RAM instead of stack

   
