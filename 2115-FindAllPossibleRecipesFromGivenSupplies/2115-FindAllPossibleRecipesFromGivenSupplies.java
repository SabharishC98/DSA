// Last updated: 9/25/2026, 2:33:07 PM
class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<Integer,List<Integer>> adj=new HashMap<>();
        int[] inorder=new int[recipes.length];
        Map<String,Boolean> sup=new HashMap<>();
        List<String> ans=new ArrayList<>();
        for(String i:supplies){
            sup.put(i,true);
        }
        for(int i=0;i<recipes.length;i++){
            adj.putIfAbsent(i, new ArrayList<>());
        }
        for(int i = 0; i < recipes.length; i++){
            for(int j = 0; j < ingredients.get(i).size(); j++){
                String ing = ingredients.get(i).get(j);
                for(int k = 0; k < recipes.length; k++){
                    if(recipes[k].equals(ing)){
                        adj.get(k).add(i);  
                        inorder[i]++;       
                        break;
                    }
                }
            }
        }
        Queue<Integer> q=new LinkedList<>();
        // for(String i:adj.keySet()){
        //     if(adj.get(i).size()==0) q.add(i);
        // }
        for(int i=0;i<recipes.length;i++){
            if(inorder[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int index=q.poll();
            boolean found=true;
            for(String i:ingredients.get(index)){
                if(!sup.containsKey(i)){
                    found=false;
                    break;
                }
            }
            if(!found) continue;
            ans.add(recipes[index]);
            sup.put(recipes[index],true);
            for(Integer i:adj.get(index)){
                inorder[i]--;
                if(inorder[i]==0) q.add(i);
            }
        }
        return ans;
    }
}