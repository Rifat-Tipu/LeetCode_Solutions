<h2><a href="https://leetcode.com/problems/valid-word/">2047. Number of Valid Words in a Sentence</a></h2>
<h3>Easy</h3>
<hr>
<p>A sentence consists of lowercase letters (<code>'a'</code> to <code>'z'</code>), digits (<code>'0'</code> to <code>'9'</code>), hyphens (<code>'-'</code>), punctuation marks (<code>'!'</code>, <code>'.'</code>, <code>','</code>), and spaces.</p>

<p>You are given a string <code>sentence</code> representing a sentence. You need to count the number of <strong>valid words</strong> in it.</p>

<p>A <strong>valid word</strong> meets the following criteria:</p>

<ul>
  <li>Only contains lowercase letters, hyphens, and/or punctuation marks.</li>
  <li>Contains at most one hyphen. If present, it must be surrounded by lowercase letters (i.e., not at the start or end and not adjacent to punctuation or digits).</li>
  <li>Contains at most one punctuation mark. If present, it must be at the end of the word.</li>
  <li>Does <strong>not</strong> contain any digits.</li>
</ul>

<p>Return the number of valid words in <code>sentence</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> sentence = "cat and  dog"
<strong>Output:</strong> 3
<strong>Explanation:</strong> The valid words in the sentence are "cat", "and", and "dog".
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> sentence = "!this 1-s b8d!"
<strong>Output:</strong> 0
<strong>Explanation:</strong> None of the words are valid.
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> sentence = "alice and  bob are playing stone-game10"
<strong>Output:</strong> 5
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= sentence.length &lt;= 1000</code></li>
  <li><code>sentence</code> includes only lowercase English letters, digits, hyphens, punctuation, and spaces.</li>
  <li>There will be at least 1 word in <code>sentence</code>.</li>
</ul>
