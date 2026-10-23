# DFS & BFS Graph Algorithms

> A Java implementation and performance comparison of two fundamental graph traversal algorithms — Depth-First Search (DFS) and Breadth-First Search (BFS) — with automated benchmarking on graphs of varying sizes.

## Features

- **Graph construction** — Add vertices and directed edges via adjacency list
- **BFS traversal** — Iterative, using `Queue` + `HashSet` for visited tracking
- **DFS traversal** — Recursive, using `HashSet` for visited tracking
- **Benchmarking** — Measure and compare execution time in nanoseconds
- **Random graph generation** — Auto-generate graphs of different sizes for experiments

## 🛠️ Tech Stack

- **Language:** Java
- **Data Structures:** `HashMap`, `ArrayList`, `Queue`, `HashSet`
- **Paradigm:** OOP + Recursion

## Project Structure

```
src/
├── Main.java          # Entry point — runs experiments
├── Graph.java         # Graph (adjacency list + BFS + DFS)
├── Vertex.java        # Vertex entity
├── Edge.java          # Edge entity (source → destination)
└── Experiment.java    # Random graph generation + benchmarking
```

## Algorithm Details

### BFS — Breadth-First Search
- **Approach:** Iterative
- **Structures:** `Queue<Integer>` + `HashSet<Integer>`
- **Complexity:** O(V + E)
- **Best for:** Shortest path in unweighted graphs

### DFS — Depth-First Search
- **Approach:** Recursive
- **Structures:** Call stack + `HashSet<Integer>`
- **Complexity:** O(V + E)
- **Best for:** Cycle detection, topological sort, maze solving

## Benchmark Setup

| Graph | Vertices | Edges |
|-------|----------|-------|
| Small | 10 | 15 |
| Medium | 30 | 35 |
| Large | 100 | 110 |

Times measured in **nanoseconds** via `System.nanoTime()`.

## 📈 Analysis

**Which is faster?**
DFS is typically faster because it uses the call stack (CPU cache-friendly), while BFS allocates a `LinkedList`-backed queue on the heap.

**When to prefer BFS?**
When you need the shortest path in an unweighted graph.

**Limitations of DFS?**
Cannot guarantee shortest path. Risks stack overflow on very deep graphs due to recursion depth.

## Key Learnings

- Graph representation via adjacency list
- Trade-offs between iterative (BFS) and recursive (DFS) approaches
- Performance measurement with `System.nanoTime()`
- How graph depth vs breadth affects traversal order

## Author

**Yermakov Ilya**
