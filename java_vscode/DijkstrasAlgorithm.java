import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
    static class pair implements Comparable<pair>
    {
         int  node;
         int des;
         public pair(int ver ,int des)
         {
             this.node=ver;
             this.des=des;
         }

        @Override
        public int compareTo(pair p2) {
           return this.des- p2.des;
        }
    }
  static   class edge{
        int sor;
        int des;
        int wet;
        public edge(int sor,int des,int wet)
        {
            this.des=des;
            this.sor=sor;
            this.wet=wet;
        }
    }
   public  static void   create_vertes(ArrayList<edge> graph[],int v)
   {
    for(int i=0;i<v;i++)
    {
        graph[i]=new ArrayList<>();

    }
    graph[0].add(new edge(0, 1, 2));
    graph[0].add(new edge(0, 2, 4));

    graph[1].add(new edge(1, 2, 1));
    graph[1].add(new edge(1, 3, 7));

    graph[2].add(new edge(2, 4, 3));

    graph[3].add(new edge(3, 5, 1));
     
    graph[4].add(new edge(4, 5, 5));
    graph[4].add(new edge(4, 3, 2));
    





   }
   public static void dijkstrasAlgorithm(ArrayList<edge> graph[] ,int sor,int V)
   {
       PriorityQueue<pair> pq=new PriorityQueue<>();
       boolean vis[] =new  boolean[V];
       int dis[]=new int[V];
       for(int i=0;i<V;i++)
       {
           if(i!=sor)
           {
             dis[i]=Integer.MAX_VALUE;
           }

       }
       pq.add(new pair(0,0));
       while (!pq.isEmpty())
       {
           pair currrent =pq.remove();
           if(!vis[currrent.node])
           {
               vis[currrent.node]=true;
               for (int i=0;i< graph[currrent.node].size();i++)
               {
                   edge e=graph[currrent.node].get(i);
                   int u=e.sor;
                   int v=e.des;
                   if(dis[v]>dis[u]+e.wet)
                   {
                        dis[v]=dis[u]+e.wet;
                        pq.add(new pair(v, dis[v]));
                   }


               }
           }
       }
       for(int i=0;i<dis.length;i++)
       {
         System.out.print(dis[i]+"  ");
       }
       System.out.println();

   }

    public static void main(String[] args) {
        int v=6;
        ArrayList<edge> graph[]=new ArrayList[v];
        create_vertes(graph,v);
        dijkstrasAlgorithm(graph,0,v);

        
        
        
    }
    
}
