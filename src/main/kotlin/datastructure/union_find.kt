package datastructure

// Union-Find
// https://zenn.dev/dhirabayashi/articles/1924139543f94e
private class UnionFind(n: Int){
    private val roots = IntArray(n){ it }
    private val ranks = IntArray(n){ 1 }

    fun find(i: Int): Int{
        if(roots[i] != i){
            roots[i] = find(roots[i])
        }

        return roots[i]
    }

    fun isSame(x: Int, y: Int): Boolean {
        return find(x) == find(y)
    }

    fun union(x: Int, y: Int){
        val rootX = find(x)
        val rootY = find(y)

        if(rootX == rootY) {
            return
        }
        if(ranks[rootX] > ranks[rootY]){
            roots[rootY] = rootX
            ++ranks[rootX]
        }else{
            roots[rootX] = rootY
            ++ranks[rootY]
        }
    }
}