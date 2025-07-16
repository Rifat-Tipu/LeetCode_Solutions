<h2><a href="https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/">3201. Find the Maximum Length of Valid Subsequence I</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given an integer array <code>nums</code>.</p>

<p>A subsequence <code>sub</code> of <code>nums</code> with length <code>x</code> is called <strong>valid</strong> if:</p>
<ul>
  <li><code>(sub[0] + sub[1]) % 2 == (sub[1] + sub[2]) % 2 == ... == (sub[x - 2] + sub[x - 1]) % 2</code></li>
</ul>

<p>A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.</p>

<p><strong>Return</strong> the length of the longest valid subsequence of <code>nums</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The whole array forms a valid subsequence.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,1,1,2,1,2]
<strong>Output:</strong> 6
<strong>Explanation:</strong> One valid subsequence is [1,2,1,2,1,2].
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,3]
<strong>Output:</strong> 2
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>2 <= nums.length <= 2·10<sup>5</sup></code></li>
  <li><code>1 <= nums[i] <= 10<sup>7</sup></code></li>
</ul>
