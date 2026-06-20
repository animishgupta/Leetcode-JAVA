class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] =s.split(" ");
        ArrayList<String> a= new ArrayList<>();
        for( int i=0;i<arr.length;i++){
            if(arr[i]!=""){
                a.add(arr[i]);
            }
        }
        String x =a.get(a.size()-1);
        return x.length();
    }
}