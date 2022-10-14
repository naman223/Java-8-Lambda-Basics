

/*"one",1 - > hashcode ->

        int[] indexes = new int[1600];

int[] indexes = new int[16];
int[] hashcode = new  int[inexes.lenght];
hashcode  -> 100000/16 - 6250

0 - 6250 -> index[0]
6251 - 6250*2 - index[1]

Node
- key
- value
- boolean marker = false
- next (Node)

get(key
- hashcode
- newHashCode
- index - Node

- node.get(key)
        put(key,value) for newhashcode - marker valuer true
        retur value
- node = node.nxt
    get(node)
- node.next null
    return null

*/
public class MyOwnHashmap {

    Object key;
    Object val;

    public MyOwnHashmap(Object key, Object val) {
        this.key = key;
        this.val = val;
    }
}
