# yrtt-techtask-employee-profile

<div class="ps-content-wrapper-v0">
<p>Implement the following classes:</p>

<p> </p>

<p>1. abstract class Employee with the following methods:</p>

<p>   * abstract void setSalary(int salary) method</p>

<p>   * abstract int getSalary() method</p>

<p>   * abstract void setGrade(String grade) method (grade of the employee in the organization)</p>

<p>   * abstract String getGrade() method</p>

<p>   * void label() method which prints "Employee's data:\n" (Concrete method, implementation is hidden from end user)</p>

<p> </p>

<p>2. class Engineer extending class Employee:</p>

<p>  * private attribute int salary</p>

<p>  * private attribute String grade</p>

<p>  * implement the setter and getter methods from the parent class to set and get attributes (salary and grade)</p>

<p> </p>

<p>3. class Manager extending class Employee:</p>

<p>  * private attribute int salary</p>

<p>  * private attribute String grade</p>

<p>  * implement the setter and getter methods from the parent class to set and get attributes (salary and grade)</p>

<p> </p>

<p><strong>Note:</strong> The code stub handles input and calls the methods.</p>

<p> </p>
<!-- <StartOfInputFormat> DO NOT REMOVE THIS LINE-->

<details><summary class="section-title">Input Format For Custom Testing</summary>

<div class="collapsable-details">
<p>The first line contains an integer, <em>n</em>, that denotes the number of employees to be instantiated.<br>
Each line <em>i</em> of the <em>n</em> subsequent lines (where <em>0 ≤ i &lt; n</em>) contains 3 variables.</p>

<p>TYPE_OF_EMPLOYEE GRADE SALARY</p>
</div>
</details>
<!-- </StartOfInputFormat> DO NOT REMOVE THIS LINE-->

<details open="open"><summary class="section-title">Sample Case 0</summary>

<div class="collapsable-details">
<p class="section-title">Sample Input For Custom Testing</p>

<pre>
2
ENGINEER B 50000
MANAGER A 70000
</pre>

<p class="section-title">Sample Output</p>

<pre>
Employee's data:
GRADE : B
SALARY : 50000
Employee's data:
GRADE : A
SALARY : 70000
</pre>

<p> </p>
</div>
</details>

<details><summary class="section-title">Sample Case 1</summary>

<div class="collapsable-details">
<p class="section-title">Sample Input For Custom Testing</p>

<pre>
3
ENGINEER B 50000
MANAGER A 70000
MANAGER A 90000 </pre>

<p class="section-title">Sample Output</p>

<pre>
Employee's data:
GRADE : B
SALARY : 50000
Employee's data:
GRADE : A
SALARY : 70000
Employee's data:
GRADE : A
SALARY : 90000
</pre>
</div>
</details>
</div>
</div></div></section></div></div></div>
