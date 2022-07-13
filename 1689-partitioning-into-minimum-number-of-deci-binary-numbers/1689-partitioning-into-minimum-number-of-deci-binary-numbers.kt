class Solution {
    fun minPartitions(n: String) = n?.maxBy { it - '0' }?.minus('0') ?: 0
}