import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;


public class PrimsAlgorithm {
    public static class  edge{
        int sor;
        int dis;
        int wit;
        public edge(int s,int d,int w)
        {
            this.sor=s;
            this.dis=d;
            this.wit=w;
        }
    }
    public static class pair implements Comparable<pair>
    {
        int node;
        int cost;
        public pair(int n,int c)
        {
            this.node=n;
            this.cost=c;

        }

        @Override
        public int compareTo(pair p2) {
            return this.cost-p2.cost;
        }
    }
    
    public static void create_vertes(ArrayList<edge> graph[],int v)
    {
        for(int i=0;i<v;i++)
        {
            graph[i]=new ArrayList<>();

        }
        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 51));
        graph[0].add(new edge(0, 3, 30));

        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 3, 40));

        graph[2].add(new edge(2, 0, 51));
        graph[2].add(new edge(2, 3, 50));

        graph[3].add(new edge(3, 0, 30));
        graph[3].add(new edge(3, 1, 40));
        graph[3].add(new edge(3, 2, 50));

    }
    public static void primsAlgorithm(ArrayList<edge> graph[],int v)
    {
       int fcost=0;
        PriorityQueue<pair> pq=new PriorityQueue<>();
        boolean []vis=new boolean[v];
        pq.add(new pair(0,0));
        while (!pq.isEmpty())
        {
            pair current=pq.remove();
            if(!vis[current.node])
            {
                vis[current.node]=true;
                 fcost=fcost+current.cost;
                 for(int i=0;i<graph[current.node].size();i++)
                 {
                     edge e=graph[current.node].get(i);
                     if(!vis[e.dis])
                     {
                        pq.add(new pair(e.dis,e.wit));
                     }
                 }

            }

        }
    System.out.println(fcost);      
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[]=new  ArrayList[v];
        create_vertes(graph,v);
        primsAlgorithm(graph,v);

    }
    
}
