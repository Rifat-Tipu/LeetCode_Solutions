<h2><a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">4. Median of Two Sorted Arrays</a></h2>
<h3>Hard</h3>
<hr>
<p>Given two sorted arrays <code>nums1</code> and <code>nums2</code> of size <code>m</code> and <code>n</code> respectively, return <em>the median of the two sorted arrays</em>.</p>

<p>The overall run time complexity should be <strong>O(log (m+n))</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums1 = [1,3], nums2 = [2]
<strong>Output:</strong> 2.0
<strong>Explanation:</strong> merged array = [1,2,3] and median is 2.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums1 = [1,2], nums2 = [3,4]
<strong>Output:</strong> 2.5
<strong>Explanation:</strong> merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>nums1.length == m</code></li>
  <li><code>nums2.length == n</code></li>
  <li><code>0 &lt;= m, n &lt;= 1000</code></li>
  <li><code>1 &lt;= m + n &lt;= 2000</code></li>
  <li><code>-10^6 &lt;= nums1[i], nums2[i] &lt;= 10^6</code></li>
</ul>
