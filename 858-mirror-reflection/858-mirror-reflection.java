// ext * p = reflection * q;
// if ext = even and ref = odd, result is 0
// if ext = odd and ref = even, result is 2
// if ext = odd and ref = odd, result is 1

class Solution {
    public int mirrorReflection(int p, int q) {
        int ext = q , reflection = p;
        while (ext%2==0 && reflection %2 ==0){
            ext/=2;
            reflection/=2;
        }
        if(ext%2==0 && reflection%2!=0) return 0;
        if(ext%2==1 && reflection%2==0) return 2;
        if(ext%2==1 && reflection%2!=0) return 1;
        
        return -1;

    }
}