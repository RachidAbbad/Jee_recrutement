<!-- Content -->
<div class="page-content bg-white">
    <!-- inner page banner -->
    <div class="dez-bnr-inr overlay-black-dark" style="background-image:url(images/banner/bnr1.jpg);">
        <div class="container">
            <div class="dez-bnr-inr-entry">
                <h1 class="text-white">Submit Resume</h1>
                <!-- Breadcrumb row -->
                <div class="breadcrumb-row">
                    <ul class="list-inline">
                        <li><a href="#">Home</a></li>
                        <li>Submit Resume</li>
                    </ul>
                </div>
                <!-- Breadcrumb row END -->
            </div>
        </div>
    </div>
    <!-- inner page banner END -->
    <!-- contact area -->
    <div class="content-block">
        <!-- Submit Resume -->
        <div class="section-full bg-white submit-resume content-inner-2">
            <div class="container">
                <form>
                    <div class="form-group">
                        <label>Your name</label>
                        <input type="text" class="form-control" placeholder="Your Full Name">
                    </div>
                    <div class="form-group">
                        <label>Your email</label>
                        <input type="email" class="form-control" placeholder="info@gmail.com">
                    </div>
                    <div class="form-group">
                        <label>Region</label>
                        <select>
                            <option>New York</option>
                            <option>London</option>
                            <option>Los Angeles</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Professional title</label>
                        <input type="text" class="form-control" placeholder="Web Designer">
                    </div>
                    <div class="form-group">
                        <label>Location</label>
                        <input type="text" class="form-control" placeholder="London">
                    </div>
                    <div class="form-group">
                        <label>Photo (optional)</label>
                        <div class="custom-file">
                            <input type="file" class="site-button" id="customFile">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Video (optional)</label>
                        <input type="text" class="form-control" placeholder="Video Link">
                    </div>
                    <div class="form-group">
                        <label>Minimum rate/h ($) (optional)</label>
                        <input type="text" class="form-control" placeholder="50 ($)">
                    </div>
                    <div class="form-group">
                        <label>Resume category</label>
                        <select>
                            <option>Designe</option>
                            <option>Construct</option>
                            <option>Food Service</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Resume Content</label>
                        <textarea class="form-control" placeholder="Your Content"></textarea>
                    </div>
                    <div class="form-group">
                        <label>Skills (optional)</label>
                        <input type="text" class="form-control" placeholder="Your Skills">
                    </div>
                    <button type="submit" class="site-button">Submit</button>
                </form>
            </div>
        </div>
        <!-- Submit Resume END -->
    </div>
</div>
<!-- Content END-->
<button class="scroltop fa fa-chevron-up"></button>
</div>

<script type="text/javascript">

    $("#exp-slider-range").slider({
        range: true,
        min: 0,
        max: 10,
        //values: [0, 10],
        slide: function (event, ui) {
            var min = ui.values[0],
                max = ui.values[1];
            $('#' + this.id).prev().val(min + " year - " + max + " year");
        }
    });

    $("#salary-slider-range").slider({
        range: true,
        min: 10,
        max: 100,
        //values: [10, 1000],
        slide: function (event, ui) {
            var min = ui.values[0],
                max = ui.values[1];
            $('#' + this.id).prev().val(min + "K - " + max + "K");
        }
    });

</script>
