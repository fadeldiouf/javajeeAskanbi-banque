<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="index-header.jsp"%>
<%@ include file="index-footer.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="../plugins/fontawesome-free/css/all.min.css">
  <!-- daterange picker -->
  <link rel="stylesheet" href="../plugins/daterangepicker/daterangepicker.css">
  <!-- iCheck for checkboxes and radio inputs -->
  <link rel="stylesheet" href="../plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Bootstrap Color Picker -->
  <link rel="stylesheet" href="../plugins/bootstrap-colorpicker/css/bootstrap-colorpicker.min.css">
  <!-- Tempusdominus Bootstrap 4 -->
  <link rel="stylesheet" href="../plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
  <!-- Select2 -->
  <link rel="stylesheet" href="../plugins/select2/css/select2.min.css">
  <link rel="stylesheet" href="../plugins/select2-bootstrap4-theme/select2-bootstrap4.min.css">
  <!-- Bootstrap4 Duallistbox -->
  <link rel="stylesheet" href="../plugins/bootstrap4-duallistbox/bootstrap-duallistbox.min.css">
  <!-- BS Stepper -->
  <link rel="stylesheet" href="../plugins/bs-stepper/css/bs-stepper.min.css">
  <!-- dropzonejs -->
  <link rel="stylesheet" href="../plugins/dropzone/min/dropzone.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../dist/css/adminlte.min.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form</title>

<<<<<<< HEAD
              <div class="card-body p-0">
                <div class="bs-stepper">
                  <div class="bs-stepper-header" role="tablist">
                    <!-- your steps here -->
                    <div class="step" data-target="#logins-part">
                      <button type="button" class="step-trigger" role="tab" aria-controls="logins-part" id="logins-part-trigger">
                        <span class="bs-stepper-circle">1</span>
                        <span class="bs-stepper-label">Information Du client</span>
                      </button>
                    </div>
                    <div class="line"></div>
                    <div class="step" data-target="#information-part">
                      <button type="button" class="step-trigger" role="tab" aria-controls="information-part" id="information-part-trigger">
                        <span class="bs-stepper-circle">2</span>
                        <span class="bs-stepper-label">Information Du coomte</span>
                      </button>
                    </div>
                  </div>
                  <div class="bs-stepper-content">
                    <!-- your steps content here -->
                    <form action="a.jsp">
                    <div id="logins-part" class="content" role="tabpanel" aria-labelledby="logins-part-trigger">
                    <div class="row">
          <div class="col-md-6">

            <div class="card card-primary">
              <div class="card-header">
                <h3 class="card-title">Info client</h3>
              </div>
              <div class="card-body">
                <!-- /.form group -->
                <div class="form-group">
                <label for="exampleInputEmail1">Nom</label>
                <div class="input-group mb-3">
		          <input type="text" class="form-control" placeholder=" nom">
		          <div class="input-group-append">
		            <div class="input-group-text">
		              <span class="fas fa-user"></span>
		            </div>
		          </div>
		        </div>
                </div>
                  <!-- /.form group -->
                  <div class="form-group">
                <label for="exampleInputEmail1">Prenom</label>
                <div class="input-group mb-3">
		          <input type="text" class="form-control" placeholder="prenom">
		          <div class="input-group-append">
		            <div class="input-group-text">
		              <span class="fas fa-user"></span>
		            </div>
		          </div>
		        </div>
                </div>
                <!-- /.form group -->
                <div class="form-group">
                <label for="exampleInputEmail1">Adresse</label>
                <div class="input-group mb-3">
                  <input type="text" class="form-control" placeholder="Adresse">
                  <div class="input-group-append">
                    <span class="input-group-text"><i class="fas fa-check"></i></span>
                  </div>
                </div>
                </div>
                <!-- Date mm/dd/yyyy -->
                <div class="form-group">
                  <label>Date de Naissance:</label>
                    <div class="input-group date" id="reservationdate" data-target-input="nearest">
                        <input type="text" class="form-control datetimepicker-input" data-target="#reservationdate"/>
                        <div class="input-group-append" data-target="#reservationdate" data-toggle="datetimepicker">
                            <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                        </div>
                    </div>
                </div>
              </div>
              <!-- /.card-body -->
            </div>

          </div>
          <!-- /.col (left) -->
          <div class="col-md-6">
            <div class="card card-primary">
              <div class="card-header">
                <h3 class="card-title">Info client</h3>
              </div>
              <div class="card-body">
                <!-- /.form group -->
                <div class="form-group">
                  <label>Telephone:</label>
                  <div class="input-group">
                    <div class="input-group-prepend">
                      <span class="input-group-text"><i class="fas fa-phone"></i></span>
                    </div>
                    <input type="text" class="form-control"
                           data-inputmask="'mask': ['99-999-99-99 [x99999]', '+099 99 99 9999[9]-9999']" data-mask>
                  </div>
                  <!-- /.input group -->
                  <!-- /.form group -->
                </div>
                <div class="form-group">
                  <label>Email:</label>
                <div class="input-group mb-3">
                  <div class="input-group-prepend">
                    <span class="input-group-text"><i class="fas fa-envelope"></i></span>
                  </div>
                  <input type="email" class="form-control" placeholder="Email">
                </div>
                </div>
                <!-- /.form group -->
                <div class="row">
                    <div class="col-sm-6">
                      <!-- select -->
                      <div class="form-group">
                        <label>Civilite</label>
                        <select class="custom-select">
                          <option>Marié</option>
                          <option>Celibataire</option>

                        </select>
                      </div>
                    </div>
                    <div class="col-sm-6">
                    <label for="radioPrimary3">
                          Genre
                        </label>
                    <div class="form-group clearfix">
                      <div class="icheck-primary d-inline">
                        <input type="radio" id="radioPrimary1" name="r1" checked>
                        <label for="radioPrimary1">
                          M
                        </label>
                      </div>
                      <div class="icheck-primary d-inline">
                        <input type="radio" id="radioPrimary2" name="r1">
                        <label for="radioPrimary2">
                          F
                        </label>
                      </div>
                    </div>
                  </div>
                </div>
                <!-- /.form group -->
                <div class="form-group">
                  <label>CNI</label>
                <div class="input-group">
                  <input type="text" class="form-control">
                  <div class="input-group-append">
                    <span class="input-group-text">123</span>
                  </div>
                </div>
                <!-- /.form group -->
              </div>
              </div>
            </div>
          </div>
        </div>
              <!-- /.card-body -->
                <button class="btn btn-primary" onclick="stepper.next()">Suivant</button>
        </div>
        
                  <div id="information-part" class="content" role="tabpanel" aria-labelledby="information-part-trigger">
                  <div class="col-md-6">
=======
    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="../css/style.css">
</head>
>>>>>>> 69f8add7c3193fa417b08e174bdb54fe44d95977

<body>
    <div class="content-wrapper md-2">
    <div class="main">
    <section class="content-header">
        <div class="container-fluide">
            <form method="POST" action="<%= request.getContextPath() %>/templates/viewClient/" class="signup-form">
	                    <div class="row md-2">
		                    <div class="col-md-6">
			                    <div class="card card-primary">
			                        <div class="card-header">
			                          <h3 class="card-title">Info client</h3>
			                         </div>
						                  <div class="card-body">
						                    <div class="row ">
						                    <div class="col-md-6">
						                    <div class="form-group">
							                    <div class="input-group mb-2">
							                    <div class="input-group-text">
									                   <span class="fas fa-user"></span>
									                </div>
									             <input type="text" class="form-control" placeholder=" nom" name="nom">
									              <div class="input-group-append">
									              </div>
									             </div>
							                  </div>
							                  </div>
							                  <div class="col-md-6">
							                  <div class="form-group">
							                    <div class="input-group mb-2">
							                        <div class="input-group-text">
									                   <span class="fas fa-user"></span>
									                </div>
									             <input type="text" class="form-control" placeholder=" prenom" name="prenom">
									              <div class="input-group-append">
									              </div>
									             </div>
							                  </div>
							                  </div>
							                  </div>
							                  <div class="form-group">
							                    <div class="input-group mb-2">
							                       <div class="input-group-text">
									                   <span class="fas fa-user"></span>
									                </div>
									             <input type="text" class="form-control" placeholder=" Addresse" name="adresse">
									              <div class="input-group-append">
									              </div>
									             </div>
							                  </div>
							                  <div class="form-group">
							                    <div class="input-group date" id="reservationdate" data-target-input="nearest">
							                    <div class="input-group-append" data-target="#reservationdate" data-toggle="datetimepicker"> 
							                    <div class="input-group-text"><i class="fa fa-calendar"></i></div>
							                    </div>
							                        <input type="text" class="form-control datetimepicker-input" data-target="#reservationdate" placeholder=" Date de naissance" name="datenaissance" />
							                         
							                        
							                    </div>
							                </div>
							                <div class="form-group">
							                   <div class="input-group">
							                    <div class="input-group-prepend">
							                      <span class="input-group-text"><i class="fas fa-phone"></i></span>
							                    </div>
							                    <input type="text" class="form-control" placeholder=" Telephone" name="telephone" >
							                   </div>
							                </div>
							                <div class="form-group">
							                <div class="input-group mb-3">
							                  <div class="input-group-prepend">
							                    <span class="input-group-text"><i class="fas fa-envelope"></i></span>
							                  </div>
							                  <input type="email" class="form-control" placeholder="Email" name="email">
							                </div>
							                </div>
			                                </div>
			                     </div>
		                    </div>
		                    <div class="col-md-6">
			                    <div class="card card-primary">
			                        <div class="card-header">
			                          <h3 class="card-title">Info client</h3>
			                         </div>
						                  <div class="card-body">
							                 
							                <div class="row">
							                    <div class="col-sm-6">
							                      <!-- select -->
							                      <div class="form-group">
							                        <select class="custom-select" name="civilite">
							                          <option value="marie" selected>Marie</option>
							                          <option value="celibataire">Celibataire</option>
			
							                        </select>
							                      </div>
							                    </div>
							                    <div class="col-sm-6">
							                      <!-- select -->
							                      <div class="form-group">
							                        <select class="custom-select" name="genre">
							                          <option value="masculin" selected>Masculin</option>
							                          <option value="feminin">Feminine</option>
			
							                        </select>
							                      </div>
							                    </div>
							                  </div>
							                  <div class="form-group">
								                 <div class="input-group">
								                 <div class="input-group-append">
								                    <span class="input-group-text">123</span>
								                  </div>
								                  <input type="text" class="form-control"placeholder="CNI" name="cni">
								                  
								                </div>
			                               </div>
			                               <div class="form-group">
				                <div class="input-group mb-3">
				                  <div class="input-group-prepend">
				                    <span class="input-group-text">Fcfa</span>
				                  </div>
				                  <input type="text" class="form-control" placeholder="Solde" name="solde">
				                </div>
				              </div>
				    <!-- /.form group -->

				               <div class="form-group">
							       <select class="custom-select" name="genre">
							         <option value="courant" selected>Courant</option>
							           <option value="epargne">Epargne</option>
			
							            </select>
							             </div>
				                <div class="row">
				                <div class="col-md-6">
				                <div class="form-group">
				                <div class="input-group mb-3">
				                <div class="input-group-append">
				            <div class="input-group-text">
				              <span class="fas fa-envelope"></span>
				            </div>
				          </div>
				          <input type="text" class="form-control "   placeholder="Usernane" name="username">
				          
				        </div>
				        </div>
				        </div>
				         <div class="col-md-6">
				         <div class="form-group">
				        <div class="input-group mb-3">
				        <div class="input-group-append">
				            <div class="input-group-text">
				              <span class="fas fa-lock"></span>
				            </div>
				          </div>
				          <input type="password" class="form-control "   placeholder="Password" name="password">
				        </div>
				        </div>
				        </div>
			             </div>                 
			               </div>
		                   </div>
	                       </div>
                       
                         </div>
                    <button type="submit" class="btn btn-primary" value="ajouter" name="action">Enregistrer </button>
                  </form>
              </div>
</section>
</div>
</div>
<<<<<<< HEAD
                  </div>
                      <button class="btn btn-primary" onclick="stepper.previous()">Precedant</button>
                      <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                  </div>
                </div>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
        </div>
        </form>
        <!-- /.row -->
            <!-- /.card -->
          </div>
        </div>
        <!-- /.row -->
      </div>
      <!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <strong>Copyright &copy; ASKANBIBANK
  </footer>
=======
>>>>>>> 69f8add7c3193fa417b08e174bdb54fe44d95977

<!-- Bootstrap 4 -->
<script src="../plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Select2 -->
<script src="../plugins/select2/js/select2.full.min.js"></script>
<!-- Bootstrap4 Duallistbox -->
<script src="../plugins/bootstrap4-duallistbox/jquery.bootstrap-duallistbox.min.js"></script>
<!-- InputMask -->
<script src="../plugins/moment/moment.min.js"></script>
<script src="../plugins/inputmask/jquery.inputmask.min.js"></script>
<!-- date-range-picker -->
<script src="../plugins/daterangepicker/daterangepicker.js"></script>
<!-- bootstrap color picker -->
<script src="../plugins/bootstrap-colorpicker/js/bootstrap-colorpicker.min.js"></script>
<!-- Tempusdominus Bootstrap 4 -->
<script src="../plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
<!-- Bootstrap Switch -->
<script src="../plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>
<!-- BS-Stepper -->
<script src="../plugins/bs-stepper/js/bs-stepper.min.js"></script>
<!-- dropzonejs -->
<script src="../plugins/dropzone/min/dropzone.min.js"></script>
<!-- AdminLTE App -->
<script src="../dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../dist/js/demo.js"></script>
<!-- Page specific script -->
<script>
  $(function () {
    //Initialize Select2 Elements
    $('.select2').select2()

    //Initialize Select2 Elements
    $('.select2bs4').select2({
      theme: 'bootstrap4'
    })

    //Datemask dd/mm/yyyy
    $('#datemask').inputmask('dd/mm/yyyy', { 'placeholder': 'dd/mm/yyyy' })
    //Datemask2 mm/dd/yyyy
    $('#datemask2').inputmask('mm/dd/yyyy', { 'placeholder': 'mm/dd/yyyy' })
    //Money Euro
    $('[data-mask]').inputmask()

    //Date picker
    $('#reservationdate').datetimepicker({
        format: 'L'
    });

    //Date and time picker
    $('#reservationdatetime').datetimepicker({ icons: { time: 'far fa-clock' } });

    //Date range picker
    $('#reservation').daterangepicker()
    //Date range picker with time picker
    $('#reservationtime').daterangepicker({
      timePicker: true,
      timePickerIncrement: 30,
      locale: {
        format: 'MM/DD/YYYY hh:mm A'
      }
    })
    //Date range as a button
    $('#daterange-btn').daterangepicker(
      {
        ranges   : {
          'Today'       : [moment(), moment()],
          'Yesterday'   : [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
          'Last 7 Days' : [moment().subtract(6, 'days'), moment()],
          'Last 30 Days': [moment().subtract(29, 'days'), moment()],
          'This Month'  : [moment().startOf('month'), moment().endOf('month')],
          'Last Month'  : [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
        },
        startDate: moment().subtract(29, 'days'),
        endDate  : moment()
      },
      function (start, end) {
        $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'))
      }
    )

    //Timepicker
    $('#timepicker').datetimepicker({
      format: 'LT'
    })

    //Bootstrap Duallistbox
    $('.duallistbox').bootstrapDualListbox()

    //Colorpicker
    $('.my-colorpicker1').colorpicker()
    //color picker with addon
    $('.my-colorpicker2').colorpicker()

    $('.my-colorpicker2').on('colorpickerChange', function(event) {
      $('.my-colorpicker2 .fa-square').css('color', event.color.toString());
    })

    $("input[data-bootstrap-switch]").each(function(){
      $(this).bootstrapSwitch('state', $(this).prop('checked'));
    })

  })
  // BS-Stepper Init
  document.addEventListener('DOMContentLoaded', function () {
    window.stepper = new Stepper(document.querySelector('.bs-stepper'))
  })
 var stepper = new Stepper(document.querySelector('.bs-stepper'))
stepper.next()

  // DropzoneJS Demo Code Start
  Dropzone.autoDiscover = false

  // Get the template HTML and remove it from the doumenthe template HTML and remove it from the doument
  var previewNode = document.querySelector("#template")
  previewNode.id = ""
  var previewTemplate = previewNode.parentNode.innerHTML
  previewNode.parentNode.removeChild(previewNode)

  var myDropzone = new Dropzone(document.body, { // Make the whole body a dropzone
    url: "/target-url", // Set the url
    thumbnailWidth: 80,
    thumbnailHeight: 80,
    parallelUploads: 20,
    previewTemplate: previewTemplate,
    autoQueue: false, // Make sure the files aren't queued until manually added
    previewsContainer: "#previews", // Define the container to display the previews
    clickable: ".fileinput-button" // Define the element that should be used as click trigger to select files.
  })

  myDropzone.on("addedfile", function(file) {
    // Hookup the start button
    file.previewElement.querySelector(".start").onclick = function() { myDropzone.enqueueFile(file) }
  })

  // Update the total progress bar
  myDropzone.on("totaluploadprogress", function(progress) {
    document.querySelector("#total-progress .progress-bar").style.width = progress + "%"
  })

  myDropzone.on("sending", function(file) {
    // Show the total progress bar when upload starts
    document.querySelector("#total-progress").style.opacity = "1"
    // And disable the start button
    file.previewElement.querySelector(".start").setAttribute("disabled", "disabled")
  })

  // Hide the total progress bar when nothing's uploading anymore
  myDropzone.on("queuecomplete", function(progress) {
    document.querySelector("#total-progress").style.opacity = "0"
  })

  // Setup the buttons for all transfers
  // The "add files" button doesn't need to be setup because the config
  // `clickable` has already been specified.
  document.querySelector("#actions .start").onclick = function() {
    myDropzone.enqueueFiles(myDropzone.getFilesWithStatus(Dropzone.ADDED))
  }
  document.querySelector("#actions .cancel").onclick = function() {
    myDropzone.removeAllFiles(true)
  }
  // DropzoneJS Demo Code End
</script>

/script>

<!-- Page specific script -->
</body>

</html>