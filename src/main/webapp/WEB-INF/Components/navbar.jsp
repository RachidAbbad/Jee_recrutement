<%--
  Created by IntelliJ IDEA.
  User: BIG CHOIX
  Date: 3/14/2021
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="site-header mo-left header fullwidth">
    <!-- main header -->
    <div class="sticky-header main-bar-wraper navbar-expand-lg">
        <div class="main-bar clearfix">
            <div class="container clearfix">
                <!-- website logo -->
                <div class="logo-header mostion">
                    <a href="index-2.html"><img src="../../Assets/images/logo.png" class="logo" alt=""></a>
                </div>
                <!-- nav toggle button -->
                <!-- nav toggle button -->
                <button class="navbar-toggler collapsed navicon justify-content-end" type="button"
                        data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span></span>
                    <span></span>
                    <span></span>
                </button>
                <!-- extra nav -->
                <div class="extra-nav">
                    <div class="extra-cell">
                        <a href="/register" class="site-button"><i class="fa fa-user"></i> Sign Up</a>
                        <a href="/login" class="site-button"><i class="fa fa-lock"></i> login</a>
                    </div>
                </div>
                <!-- Quik search -->
                <div class="dez-quik-search bg-primary">
                    <form action="#">
                        <input name="search" value="" type="text" class="form-control" placeholder="Type to search">
                        <span id="quik-search-remove"><i class="flaticon-close"></i></span>
                    </form>
                </div>
                <!-- main nav -->
                <div class="header-nav navbar-collapse collapse justify-content-start" id="navbarNavDropdown">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">Home <i class="fa fa-chevron-down"></i></a>
                            <ul class="sub-menu">
                                <li><a href="index-2.html" class="dez-page">Home 1</a></li>
                                <li><a href="index-3.html" class="dez-page">Home 2</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">For Candidates <i class="fa fa-chevron-down"></i></a>
                            <ul class="sub-menu">
                                <li><a href="browse-job.html" class="dez-page">Browse Job</a></li>
                                <li><a href="companies.html" class="dez-page">companies</a></li>
                                <li><a href="job-detail.html" class="dez-page">Job Detail</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">For Employers <i class="fa fa-chevron-down"></i></a>
                            <ul class="sub-menu">
                                <li><a href="browse-candidates.html" class="dez-page">Browse Candidates</a></li>
                                <li><a href="submit-resume.html" class="dez-page">Submit Resume</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">Pages <i class="fa fa-chevron-down"></i></a>
                            <ul class="sub-menu">
                                <li><a href="/about-us" class="dez-page">About Us</a></li>
                                <li><a href="#" class="dez-page">Coming Soon</a></li>
                                <li><a href="#" class="dez-page">Error 404</a></li>
                                <li><a href="#" class="dez-page">Portfolio</a>
                                    <ul class="sub-menu">
                                        <li><a href="portfolio-grid-2.html" class="dez-page">Portfolio Grid 2 </a></li>
                                        <li><a href="portfolio-grid-3.html" class="dez-page">Portfolio Grid 3 </a></li>
                                        <li><a href="portfolio-grid-4.html" class="dez-page">Portfolio Grid 4 </a></li>
                                    </ul>
                                </li>
                                <li><a href="/login" class="dez-page">Login</a></li>
                                <li><a href="/register" class="dez-page">Register</a></li>
                                <li><a href="contact.html" class="dez-page">Contact Us</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">Blog <i class="fa fa-chevron-down"></i></a>
                            <ul class="sub-menu">
                                <li><a href="blog-classic.html" class="dez-page">Classic</a></li>
                                <li><a href="blog-classic-sidebar.html" class="dez-page">Classic Sidebar</a></li>
                                <li><a href="blog-detailed-grid.html" class="dez-page">Detailed Grid</a></li>
                                <li><a href="blog-detailed-grid-sidebar.html" class="dez-page">Detailed Grid Sidebar</a>
                                </li>
                                <li><a href="blog-left-img.html" class="dez-page">Left Image Sidebar</a></li>
                                <li><a href="blog-details.html" class="dez-page">Blog Details</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- main header END -->
</header>
