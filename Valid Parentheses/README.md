<h2><a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a></h2>
<h3>Easy</h3>
<hr>
<p>Given a string <code>s</code> containing just the characters <code>'('</code>, <code>')'</code>, <code>'{'</code>, <code>'}'</code>, <code>'['</code> and <code>']'</code>, determine if the input string is <strong>valid</strong>.</p>

<p>An input string is valid if:</p>
<ul>
  <li>Open brackets must be closed by the same type of brackets.</li>
  <li>Open brackets must be closed in the correct order.</li>
  <li>Every close bracket has a corresponding open bracket of the same type.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> s = "()"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> s = "()[]{}"
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> s = "(]"
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
  <li><code>s</code> consists of parentheses only <code>'()[]{}'</code>.</li>
</ul>
