<%@ include file="index-header.jsp"%>
<%@ include file="index-footer.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>AdminLTE 3 | DataTables</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="../plugins/fontawesome-free/css/all.min.css">
  <!-- DataTables -->
  <link rel="stylesheet" href="../plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
  <link rel="stylesheet" href="../plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
  <link rel="stylesheet" href="../plugins/datatables-buttons/css/buttons.bootstrap4.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../dist/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">


  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Listes des clients</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
            <td>
              <a href="ajouterClient.jsp">
              <button type="button" class="btn btn-block btn-primary">Nouveau client</button>
              </a>
              </td>

            </ol>

          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-12">
            <!-- /.card -->
            <div class="card">
              <!-- /.card-header -->
              <div class="card-body">
                <table id="example1" class="table table-bordered table-striped">
                  <thead>
                  <tr>
                    <th>Rendering engine</th>
                    <th>Browser</th>
                    <th>Platform(s)</th>
                    <th>Engine version</th>
                    <th>CSS grade</th>
                  </tr>
                  </thead>
                  <tbody>
                  <tr>
                    <td>Trident</td>
                    <td>Internet
                      Explorer 4.0
                    </td>
                    <td>Win 95+</td>
                    <td> 4</td>
                    <td>X</td>
                  </tr>
                  <tr>
                    <td>Trident</td>
                    <td>Internet
                      Explorer 5.0
                    </td>
                    <td>Win 95+</td>
                    <td>5</td>
                    <td>C</td>
                  </tr>
                  <tr>
                    <td>Trident</td>
                    <td>Internet
                      Explorer 5.5
                    </td>
                    <td>Win 95+</td>
                    <td>5.5</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Trident</td>
                    <td>Internet
                      Explorer 6
                    </td>
                    <td>Win 98+</td>
                    <td>6</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Trident</td>
                    <td>Internet Explorer 7</td>
                    <td>Win XP SP2+</td>
                    <td>7</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Trident</td>
                    <td>AOL browser (AOL desktop)</td>
                    <td>Win XP</td>
                    <td>6</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Firefox 1.0</td>
                    <td>Win 98+ / OSX.2+</td>
                    <td>1.7</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Firefox 1.5</td>
                    <td>Win 98+ / OSX.2+</td>
                    <td>1.8</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Firefox 2.0</td>
                    <td>Win 98+ / OSX.2+</td>
                    <td>1.8</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Firefox 3.0</td>
                    <td>Win 2k+ / OSX.3+</td>
                    <td>1.9</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Camino 1.0</td>
                    <td>OSX.2+</td>
                    <td>1.8</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Camino 1.5</td>
                    <td>OSX.3+</td>
                    <td>1.8</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Netscape 7.2</td>
                    <td>Win 95+ / Mac OS 8.6-9.2</td>
                    <td>1.7</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Netscape Browser 8</td>
                    <td>Win 98SE+</td>
                    <td>1.7</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Netscape Navigator 9</td>
                    <td>Win 98+ / OSX.2+</td>
                    <td>1.8</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Mozilla 1.0</td>
                    <td>Win 95+ / OSX.1+</td>
                    <td>1</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Mozilla 1.1</td>
                    <td>Win 95+ / OSX.1+</td>
                    <td>1.1</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Mozilla 1.2</td>
                    <td>Win 95+ / OSX.1+</td>
                    <td>1.2</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Mozilla 1.3</td>
                    <td>Win 95+ / OSX.1+</td>
                    <td>1.3</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Mozilla 1.4</td>
                    <td>Win 95+ / OSX.1+</td>
                    <td>1.4</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Mozilla 1.5</td>
                    <td>Win 95+ / OSX.1+</td>
                    <td>1.5</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Mozilla 1.6</td>
                    <td>Win 95+ / OSX.1+</td>
                    <td>1.6</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Mozilla 1.7</td>
                    <td>Win 98+ / OSX.1+</td>
                    <td>1.7</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Mozilla 1.8</td>
                    <td>Win 98+ / OSX.1+</td>
                    <td>1.8</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Seamonkey 1.1</td>
                    <td>Win 98+ / OSX.2+</td>
                    <td>1.8</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Gecko</td>
                    <td>Epiphany 2.20</td>
                    <td>Gnome</td>
                    <td>1.8</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Webkit</td>
                    <td>Safari 1.2</td>
                    <td>OSX.3</td>
                    <td>125.5</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Webkit</td>
                    <td>Safari 1.3</td>
                    <td>OSX.3</td>
                    <td>312.8</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Webkit</td>
                    <td>Safari 2.0</td>
                    <td>OSX.4+</td>
                    <td>419.3</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Webkit</td>
                    <td>Safari 3.0</td>
                    <td>OSX.4+</td>
                    <td>522.1</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Webkit</td>
                    <td>OmniWeb 5.5</td>
                    <td>OSX.4+</td>
                    <td>420</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Webkit</td>
                    <td>iPod Touch / iPhone</td>
                    <td>iPod</td>
                    <td>420.1</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Webkit</td>
                    <td>S60</td>
                    <td>S60</td>
                    <td>413</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Opera 7.0</td>
                    <td>Win 95+ / OSX.1+</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Opera 7.5</td>
                    <td>Win 95+ / OSX.2+</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Opera 8.0</td>
                    <td>Win 95+ / OSX.2+</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Opera 8.5</td>
                    <td>Win 95+ / OSX.2+</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Opera 9.0</td>
                    <td>Win 95+ / OSX.3+</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Opera 9.2</td>
                    <td>Win 88+ / OSX.3+</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Opera 9.5</td>
                    <td>Win 88+ / OSX.3+</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Opera for Wii</td>
                    <td>Wii</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Nokia N800</td>
                    <td>N800</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Presto</td>
                    <td>Nintendo DS browser</td>
                    <td>Nintendo DS</td>
                    <td>8.5</td>
                    <td>C/A<sup>1</sup></td>
                  </tr>
                  <tr>
                    <td>KHTML</td>
                    <td>Konqureror 3.1</td>
                    <td>KDE 3.1</td>
                    <td>3.1</td>
                    <td>C</td>
                  </tr>
                  <tr>
                    <td>KHTML</td>
                    <td>Konqureror 3.3</td>
                    <td>KDE 3.3</td>
                    <td>3.3</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>KHTML</td>
                    <td>Konqureror 3.5</td>
                    <td>KDE 3.5</td>
                    <td>3.5</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Tasman</td>
                    <td>Internet Explorer 4.5</td>
                    <td>Mac OS 8-9</td>
                    <td>-</td>
                    <td>X</td>
                  </tr>
                  <tr>
                    <td>Tasman</td>
                    <td>Internet Explorer 5.1</td>
                    <td>Mac OS 7.6-9</td>
                    <td>1</td>
                    <td>C</td>
                  </tr>
                  <tr>
                    <td>Tasman</td>
                    <td>Internet Explorer 5.2</td>
                    <td>Mac OS 8-X</td>
                    <td>1</td>
                    <td>C</td>
                  </tr>
                  <tr>
                    <td>Misc</td>
                    <td>NetFront 3.1</td>
                    <td>Embedded devices</td>
                    <td>-</td>
                    <td>C</td>
                  </tr>
                  <tr>
                    <td>Misc</td>
                    <td>NetFront 3.4</td>
                    <td>Embedded devices</td>
                    <td>-</td>
                    <td>A</td>
                  </tr>
                  <tr>
                    <td>Misc</td>
                    <td>Dillo 0.8</td>
                    <td>Embedded devices</td>
                    <td>-</td>
                    <td>X</td>
                  </tr>
                  <tr>
                    <td>Misc</td>
                    <td>Links</td>
                    <td>Text only</td>
                    <td>-</td>
                    <td>X</td>
                  </tr>
                  <tr>
                    <td>Misc</td>
                    <td>Lynx</td>
                    <td>Text only</td>
                    <td>-</td>
                    <td>X</td>
                  </tr>
                  <tr>
                    <td>Misc</td>
                    <td>IE Mobile</td>
                    <td>Windows Mobile 6</td>
                    <td>-</td>
                    <td>C</td>
                  </tr>
                  <tr>
                    <td>Misc</td>
                    <td>PSP browser</td>
                    <td>PSP</td>
                    <td>-</td>
                    <td>C</td>
                  </tr>
                  <tr>
                    <td>Other browsers</td>
                    <td>All others</td>
                    <td>-</td>
                    <td>-</td>
                    <td>U</td>
                  </tr>
                  </tbody>
                  <tfoot>
                  <tr>
                    <th>Rendering engine</th>
                    <th>Browser</th>
                    <th>Platform(s)</th>
                    <th>Engine version</th>
                    <th>CSS grade</th>
                  </tr>
                  </tfoot>
                </table>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
          <!-- /.col -->
        </div>
        <!-- /.row -->
      </div>
      <!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="../../../plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- DataTables  & ../Plugins -->
<script src="../plugins/datatables/jquery.dataTables.min.js"></script>
<script src="../plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
<script src="../plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
<script src="../plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
<script src="../plugins/datatables-buttons/js/dataTables.buttons.min.js"></script>
<script src="../plugins/datatables-buttons/js/buttons.bootstrap4.min.js"></script>
<script src="../plugins/jszip/jszip.min.js"></script>
<script src="../plugins/pdfmake/pdfmake.min.js"></script>
<script src="../plugins/pdfmake/vfs_fonts.js"></script>
<script src="../plugins/datatables-buttons/js/buttons.html5.min.js"></script>
<script src="../plugins/datatables-buttons/js/buttons.print.min.js"></script>
<script src="../plugins/datatables-buttons/js/buttons.colVis.min.js"></script>
<!-- AdminLTE App -->
<script src="../dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../dist/js/demo.js"></script>
<!-- Page specific script -->
<script>
  $(function () {
    $("#example1").DataTable({
      "responsive": true, "lengthChange": false, "autoWidth": false,
      "buttons": ["copy", "csv", "excel", "pdf", "print"]
    }).buttons().container().appendTo('#example1_wrapper .col-md-6:eq(0)');
    $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false,
      "responsive": true,
    });
  });
</script>
<footer class="main-footer">
    <strong>Copyright &copy; 2014-2021 <a href="https://adminlte.io">ASKANBIBANK</a>.</strong>
</footer>
