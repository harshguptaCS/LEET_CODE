class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(String x:path.split("/")){
            if(x.equals("")||x.equals(".")) continue;
            if(x.equals("..")){
                if(s.size()>0) s.pop();
            }
            else s.push(x);
        }
        if(s.size()==0) return "/";
        while(s.size()>0){
            str.insert(0,s.pop());
            str.insert(0,"/");
        }
        return str.toString();
    }
}
