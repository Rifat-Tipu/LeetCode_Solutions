<h2><a href="https://leetcode.com/problems/maximum-matching-of-players-with-trainers/">2410. Maximum Matching of Players With Trainers</a></h2>
<h3>Medium</h3>
<hr>
<p>You are given a <strong>0-indexed</strong> integer array <code>players</code>, where <code>players[i]</code> is the <strong>ability</strong> of the <code>i<sup>th</sup></code> player. You are also given a <strong>0-indexed</strong> integer array <code>trainers</code>, where <code>trainers[j]</code> is the <strong>training capacity</strong> of the <code>j<sup>th</sup></code> trainer.</p>

<p>The <code>i<sup>th</sup></code> player can be matched with the <code>j<sup>th</sup></code> trainer if the player's ability is **less than or equal to** the trainer's training capacity. Each player can be matched with **at most one** trainer, and each trainer can be matched with **at most one** player.</p>

<p>Return <em>the **maximum number of matchings** between players and trainers that satisfy these conditions.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> players = [4,7,9], trainers = [8,2,5,8]
<strong>Output:</strong> 2
<strong>Explanation:</strong> One of the ways we can form two matchings is as follows:
- Player 0 with ability 4 is matched with Trainer 2 with capacity 5.
- Player 1 with ability 7 is matched with Trainer 0 with capacity 8.
Note that Trainer 3 with capacity 8 cannot be matched with Player 2 with ability 9 since 9 > 8.
It can be proven that 2 is the maximum number of matchings that can be formed.
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> players = [1,1,1], trainers = [10]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The trainer can be matched with any player.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= players.length, trainers.length &lt;= 10<sup>5</sup></code></li>
  <li><code>1 &lt;= players[i], trainers[j] &lt;= 10<sup>9</sup></code></li>
</ul>
