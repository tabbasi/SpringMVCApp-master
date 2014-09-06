<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="description">
    <meta content="" name="author">
    <link href="" rel="shortcut icon">

    <title>Sign Up</title>

    <!-- Bootstrap core CSS -->
    <%--<link href="http://getbootstrap.com/dist/css/bootstrap.min.css" rel="stylesheet">--%>
    <%--<link href="http://getbootstrap.com/dist/css/bootstrap-responsive.min.css" rel="stylesheet">--%>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">

</head>

<body>
<div class="container">
<div class="well">
<%--<form action="process_signup.php" class="form-horizontal well" method="post">--%>
<form:form method="post" action="add" commandName="user" role="form">
    <%--<fieldset>--%>
<legend>Sign Up</legend>
<h4>It’s free and always will be.</h4>

<div class="rows">

<div class="col-xs-8">
<div class="form-group">
    <div class="rows">
        <div class="col-md-8">
            <div class="col-lg-6">
                    <%--<input class="form-control input-lg" id="fName" name="fName" placeholder="First Name" type="text">--%>
                <form:label path="firstName">First Name:</form:label>
                <form:input path="firstName" class="form-control input-lg" placeholder="First Name"/>
            </div>

            <div class="col-lg-6">
                <%--<input class="form-control input-lg" id="lName" name="lName" placeholder="Last Name" type="text">--%>
                <form:label path="lastName">Last Name:</form:label>
                <form:input path="lastName" class="form-control input-lg" placeholder="Last Name"/>
            </div>
        </div>
    </div>
</div>

<div class="form-group">
    <div class="rows">
        <div class="col-md-8">
            <div class="col-lg-12">
                <%--<input class="form-control input-lg" id="email" name="email" placeholder="Your Email" type="text">--%>
                <%--<form:label path="email">Email:</form:label>--%>
                <%--<form:input path="email" class="form-control input-lg" placeholder="Email"/>--%>
            </div>
        </div>
    </div>
</div>

<div class="form-group">
    <div class="rows">
        <div class="col-md-8">
            <div class="col-lg-12">
                <input class="form-control input-lg" id="reemail" name="reemail" placeholder="Re-enter Email"
                       type="text">
            </div>
        </div>
    </div>
</div>

<div class="form-group">
    <div class="rows">
        <div class="col-md-8">
            <div class="col-lg-12">
                <input class="form-control input-lg" id="password" name="password" placeholder="Password" type=
                        "password">
            </div>
        </div>
    </div>
</div>
<div class="form-group">
    <div class="rows">
        <div class="col-md-8">
            <div class="col-lg-12">
                <input class="form-control input-lg" id="reenterPassword" name="password" placeholder="Re-EnterPassword"
                       type=
                               "password">
            </div>
        </div>
    </div>
</div>
<div class="form-group">
    <div class="rows">
        <div class="col-md-8">
            <div class="col-lg-12">
                <input class="form-control input-lg" id="MobileNumber" name="password" placeholder="Mobile Number" type=
                        "password">
            </div>
        </div>
    </div>
</div>
<div class="form-group">
    <div class="rows">
        <div class="col-md-8">
            <h4>
                <div class="col-md-3">
                    <label class="col-lg-4 control-label">Birthday</label>
                </div>

                <div class="col-lg-3">
                    <select class="form-control input-sm" name="month">
                        <option>Month</option>
                        <!--php code for populating the selectbox for Month -->
                        <option> January</option>
                        <option> Feburary</option>
                        <option> March</option>
                        <option> April</option>
                        <option> May</option>
                        <option> June</option>
                        <option> July</option>
                        <option> August</option>
                        <option> September</option>
                        <option> October</option>
                        <option> November</option>
                        <option> December</option>
                    </select>
                </div>

                <div class="col-lg-3">
                    <select class="form-control input-sm" name="day">
                        <option>Day</option>
                        <!--php code for populating the selectbox for Day -->
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                        <option>6</option>
                        <option>7</option>
                        <option>8</option>
                        <option>9</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                        <option>13</option>
                        <option>14</option>
                        <option>15</option>
                        <option>16</option>
                        <option>17</option>
                        <option>18</option>
                        <option>19</option>
                        <option>20</option>
                        <option>21</option>
                        <option>22</option>
                        <option>23</option>
                        <option>24</option>
                        <option>25</option>
                        <option>26</option>
                        <option>27</option>
                        <option>28</option>
                        <option>29</option>
                        <option>30</option>
                        <option>31</option>
                    </select>
                </div>

                <div class="col-lg-3">
                    <select class="form-control input-sm" name="year">
                        <option>Year</option>
                        <option>1950</option>
                        <option>1951</option>
                        <option>1952</option>
                        <option>1953</option>
                        <option>1954</option>
                        <option>1955</option>
                        <option>1956</option>
                        <option>1957</option>
                        <option>1958</option>
                        <option>1959</option>
                        <option>1960</option>
                        <option>1961</option>
                        <option>1962</option>
                        <option>1963</option>
                        <option>1964</option>
                        <option>1965</option>
                        <option>1966</option>
                        <option>1967</option>
                        <option>1968</option>
                        <option>1969</option>
                        <option>1970</option>
                        <option>1971</option>
                        <option>1972</option>
                        <option>1973</option>
                        <option>1974</option>
                        <option>1975</option>
                        <option>1976</option>
                        <option>1977</option>
                        <option>1978</option>
                        <option>1979</option>
                        <option>1980</option>
                        <option>1981</option>
                        <option>1982</option>
                        <option>1983</option>
                        <option>1984</option>
                        <option>1985</option>
                        <option>1986</option>
                        <option>1987</option>
                        <option>1988</option>
                        <option>1989</option>
                        <option>1990</option>
                        <option>1991</option>
                        <option>1992</option>
                        <option>1993</option>
                        <option>1994</option>
                        <option>1995</option>
                        <option>1996</option>
                        <option>1997</option>
                        <option>1998</option>
                        <option>1999</option>
                        <option>2000</option>
                        <option>2001</option>
                        <option>2002</option>
                        <option>2003</option>


                    </select>

                    <div class="col-lg-3">

                    </div>
                </div>
            </h4>
        </div>
    </div>
</div>
<div class="form-group">
    <div class="rows">
        <div class="col-md-8">
                <%--<h4>--%>
            <div class="col-md-3">
                <label class="col-lg-4 control-label">Nationality</label>
            </div>

            <div class="col-lg-3">
                <select class="form-control input-sm" name="Nationality">
                    <option>City</option>
                    <!--php code for populating the selectbox for Month -->
                    <option> Como</option>
                    <option> Milano</option>
                    <option> Bari</option>
                    <option> Napoli</option>
                </select>
            </div>

            <div class="col-lg-3">
                <select class="form-control input-sm" name="Nationality">
                    <option>Nationality</option>
                    <!--php code for populating the selectbox for Day -->
                    <option>Italy</option>
                    <option>France</option>
                    <option>Germany</option>
                    <option>Belgium</option>
                    <option>Denmark</option>
                </select>
            </div>
        </div>
    </div>
    </h4>
</div>
</div>
</div>
<div class="col-md-3">
    <label class="col-lg-4 control-label">Gender</label>
</div>
<div class="form-group">

    <div class="rows">

        <div class="col-md-4">
            <div class="col-lg-6">

                <div class="col-md-3">

                </div>
                <div class="radio">
                    <label><input checked id="optionsRadios1" name="optionsRadios" type="radio"
                                  value="Female">Female</label>
                </div>
            </div>

            <div class="col-lg-6">
                <div class="radio">
                    <label><input id="optionsRadios2" name="optionsRadios" type="radio" value="Male"> Male</label>
                </div>
            </div>
        </div>
    </div>
</div>


<h4>Special Requirments <span class="label label-default"></span></h4>

<div class="checkbox">
    <label>
        <input type="checkbox"> Travel with assistance dogs
    </label>
</div>
<div class="checkbox">
    <label>
        <input type="checkbox"> Mobility & Wheelchair assistance
    </label>

</div>
<div class="checkbox">
    <label>
        <input type="checkbox"> Visual Impairment
    </label>
</div>
<div class="checkbox">
    <label>
        <input type="checkbox"> Hearing Impairment
    </label>
</div>
<div class="checkbox">
    <label>
        <input type="checkbox"> Learning difficulties
    </label>
</div>

</div>
</div>

<div class="checkbox">

    <input class="form-control input-lg" id="email2" name="email" placeholder=" Other Please Specify" type="text">
</div>
</div>


</div>


</div>
<div class="form-group">
    <div class="rows">
        <div class="col-md-8">
            <div class="col-lg-12">
                <button class="btn btn-success btn-lg" type="submit">Sign Up</button>
            </div>
        </div>
    </div>
</div>
</fieldset>
</form:form>

</div>
</div><!-- /container -->
</body>
</html>