<h2><a href="https://leetcode.com/problems/valid-word/">3136. Valid Word</a></h2>
<h3>Easy</h3>
<hr>
<p>A word is considered <strong>valid</strong> if:</p>

<ul>
  <li>It contains a minimum of <strong>3 characters</strong>.</li>
  <li>It contains only <strong>digits (0-9)</strong> and <strong>English letters</strong> (uppercase and lowercase).</li>
  <li>It includes at least <strong>one vowel</strong>.</li>
  <li>It includes at least <strong>one consonant</strong>.</li>
</ul>

<p>You are given a string <code>word</code>. Return <code>true</code> if <code>word</code> is valid, otherwise return <code>false</code>.</p>

<p><strong>Notes:</strong></p>
<ul>
  <li><code>'a'</code>, <code>'e'</code>, <code>'i'</code>, <code>'o'</code>, <code>'u'</code> and their uppercase counterparts are considered vowels.</li>
  <li>A consonant is an English letter that is not a vowel.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> word = "234Adas"
<strong>Output:</strong> true
<strong>Explanation:</strong> This word satisfies all the conditions.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> word = "b3"
<strong>Output:</strong> false
<strong>Explanation:</strong> The length is less than 3 and it doesn't contain a vowel.
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> word = "a3$e"
<strong>Output:</strong> false
<strong>Explanation:</strong> The word contains an invalid character '$' and does not contain a consonant.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= word.length &lt;= 20</code></li>
  <li><code>word</code> consists of English uppercase and lowercase letters, digits, <code>'@'</code>, <code>'#'</code>, and <code>'$'</code>.</li>
</ul>
