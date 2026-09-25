// Last updated: 9/25/2026, 2:47:48 PM
class Solution {
    List<String> l;
    public String originalDigits(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char characters[]=new char[]{'u','w','z','x','g','h','o','t','s','v','i'};
        l=new ArrayList<>();
        for(char ch:characters){
            if(!map.containsKey(ch) || map.get(ch)==0) continue;
            int count=map.get(ch);
            if(ch=='u'){
                map.remove('u');
                map.put('f',map.get('f')-count);
                map.put('o',map.get('o')-count);
                map.put('r',map.get('r')-count);
                addelement(4,count);
            }
            else if(ch=='w'){
                map.remove('w');
                map.put('t',map.get('t')-count);
                map.put('o',map.get('o')-count);
                addelement(2,count);
            }
            else if(ch=='z'){
                map.remove('z');
                map.put('e',map.get('e')-count);
                map.put('r',map.get('r')-count);
                map.put('o',map.get('o')-count);
                addelement(0,count);
            }
            else if(ch=='x'){
                map.remove('x');
                map.put('s',map.get('s')-count);
                map.put('i',map.get('i')-count);
                addelement(6,count);
            }
            else if(ch=='g'){
                map.remove('g');
                map.put('e',map.get('e')-count);
                map.put('i',map.get('i')-count);
                map.put('h',map.get('h')-count);
                map.put('t',map.get('t')-count);
                addelement(8,count);
            }
            else if(ch=='h'){
                map.remove('h');
                map.put('e',map.get('e')-2*count);
                map.put('r',map.get('r')-count);
                map.put('t',map.get('t')-count);
                addelement(3,count);
            }
            else if(ch=='o'){
                map.remove('o');
                map.put('e',map.get('e')-count);
                map.put('n',map.get('n')-count);
                addelement(1,count);
            }
            else if(ch=='t'){
                map.remove('t');
                map.put('e',map.get('e')-count);
                map.put('n',map.get('n')-count);
                addelement(10,count);
            }
            else if(ch=='s'){
                map.remove('s');
                map.put('e',map.get('e')-2*count);
                map.put('v',map.get('v')-count);
                map.put('n',map.get('n')-count);
                addelement(7,count);
            }
            else if(ch=='v'){
                map.remove('v');
                map.put('e',map.get('e')-count);
                map.put('f',map.get('f')-count);
                map.put('i',map.get('i')-count);
                addelement(5,count);
            }
            else if(ch=='i'){
                addelement(9,count);
            }
        }
        Collections.sort(l);
        StringBuilder sb=new StringBuilder("");
        for(String i:l){
            sb.append(i);
        }
        return sb.toString();
    }
    public void addelement(int num,int count){
        String sb=new String(num+"");
        l.add(sb.repeat(count));
    }
}