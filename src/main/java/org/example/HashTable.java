package org.example;
import java.util.Arrays;

public class HashTable {

    String[] Hmap = new String[3];

    public HashTable () {
    }

    public void put(String key, String value){
        int position = getPosition(key);

        while (this.Hmap[position] != null){
            this.resizeArr();
            position = getPosition(key);
        }

        this.Hmap[position] = String.format("%s|%s",key,value);
    }

    public String get(String key){
        int position = getPosition(key);
        return (this.Hmap[position].split("\\|")[1]);
    }

    public String getAll(){
        System.out.println(this.Hmap.length);
       return Arrays.toString(Hmap);
    }

    private void resizeArr() {
        int i = 0;
        int copyLength = this.Hmap.length*2;
        String[] copy = new String[Prime.nextPrime(copyLength)];

        while (i < this.Hmap.length) {
            if (this.Hmap[i] != null) {
                int position = (int) StringHashFunction.polynomialRollingHash(getKey(i)) % copy.length;
                if (copy[position] != null) {
                    copy = new String[Prime.nextPrime(copy.length)];
                    i = 0;
                } else {
                    copy[position] = this.Hmap[i];
                }
            }
            i++;
        }
        this.Hmap = copy;

    }

    public String getKey(int position){
        return this.Hmap[position].split("\\|")[0];
    }

    public int getPosition(String key){
        return (int) StringHashFunction.polynomialRollingHash(key) % Hmap.length;
    }

    public void remove(String key){
        this.Hmap[getPosition(key)] = null;
    }

    public void clear(){
        this.Hmap = new String[3];
    }
}
