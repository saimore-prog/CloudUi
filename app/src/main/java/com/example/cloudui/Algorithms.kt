package com.example.cloudui

/**
 * Two Sum: Given an array of integers and a target, return indices of the two numbers 
 * that add up to the target.
 *
 * Time Complexity: O(n) using a HashMap
 * Space Complexity: O(n)
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf() // No solution found
}
