class Solution {
    public boolean judgeCircle(String moves) {
        HashMap<Character, Integer> movesMap = new HashMap<>();
        movesMap.put('R',0);
        movesMap.put('L',0);
        movesMap.put('U',0);
        movesMap.put('D',0);
        
        for(int i = 0; i < moves.length();i++){
            char currentMove = moves.charAt(i);
            movesMap.put(currentMove,movesMap.get(currentMove)+1);
        } 

        int r = movesMap.get('R');
        int l = movesMap.get('L');
        int u = movesMap.get('U');
        int d = movesMap.get('D');

        System.out.println(movesMap.get('R'));
        System.out.println(movesMap.get('L'));
        System.out.println(movesMap.get('U'));
        System.out.println(movesMap.get('D'));

        if((r==l) && (u==d)){
            return true;
        } else{
            return false;
        }
    }
}