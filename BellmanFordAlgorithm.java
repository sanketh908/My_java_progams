import java.util.ArrayList;



public class BellmanFordAlgorithm {
    public static void bellmanFordAlgorithm(ArrayList<edge> graph[],int v,int sor)
    {
        int [] dis=new int[v];
       
        for(int i=0;i<v;i++)
        {
            if(i!=sor)
            {
                 dis[i]=Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<v-1;k++)
        {
            for(int i=0;i<v;i++)
            {
                for(int j=0;j<graph[i].size();j++)
                {
                    edge e=graph[i].get(j);
                    int u=e.sor;
                    int V=e.des;
                    if(dis[u]!=Integer.MAX_VALUE&&dis[u]+e.wet<dis[V])
                    {
                        dis[V]=dis[u]+e.wet;
                    }
                }
            }
        }
        for(int i:dis)
        {
            System.out.print(i+" ");
        }

    }
    public static void create_vertes(ArrayList<edge> []graph,int v)
    {
        for(int i=0;i<v;i++)
        {
            graph[i]=new ArrayList<>();
        }
         graph[0].add(new edge(0, 1, 2));
         graph[0].add(new edge(0, 2, 4));

         graph[1].add(new edge(1, 2, -4));

         graph[2].add(new edge(2, 3, 2));

         graph[3].add(new edge(3, 4, 4));

         graph[4].add(new edge(4, 1, -1));



    }
    public static class edge
    {
        int sor;
        int des;
        int wet;
        public edge (int s,int d,int w)
        {
            this.sor=s;
            this.des=d;
            this.wet=w;

        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<edge> []graph=new ArrayList[v];
        create_vertes(graph, v);
        bellmanFordAlgorithm(graph,v,0);
        
    }
}
