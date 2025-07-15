<h2><a href="https://leetcode.com/problems/integer-to-roman/">12. Integer to Roman</a></h2>
<h3>Medium</h3>
<hr>
<p>Given an integer <code>num</code>, convert it to a <strong>Roman numeral</strong>.</p>

<p>Roman numerals are represented by seven different symbols: <code>I</code>, <code>V</code>, <code>X</code>, <code>L</code>, <code>C</code>, <code>D</code>, and <code>M</code>.</p>

<table>
  <tr><th>Symbol</th><th>Value</th></tr>
  <tr><td>I</td><td>1</td></tr>
  <tr><td>V</td><td>5</td></tr>
  <tr><td>X</td><td>10</td></tr>
  <tr><td>L</td><td>50</td></tr>
  <tr><td>C</td><td>100</td></tr>
  <tr><td>D</td><td>500</td></tr>
  <tr><td>M</td><td>1000</td></tr>
</table>

<p>Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code>IIII</code>. Instead, the number four is written as <code>IV</code>. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as <code>IX</code>. There are six instances where subtraction is used:</p>

<ul>
  <li><code>I</code> can be placed before <code>V</code> (5) and <code>X</code> (10) to make 4 and 9.</li>
  <li><code>X</code> can be placed before <code>L</code> (50) and <code>C</code> (100) to make 40 and 90.</li>
  <li><code>C</code> can be placed before <code>D</code> (500) and <code>M</code> (1000) to make 400 and 900.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> num = 3
<strong>Output:</strong> "III"
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> num = 4
<strong>Output:</strong> "IV"
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> num = 9
<strong>Output:</strong> "IX"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= num &lt;= 3999</code></li>
</ul>
