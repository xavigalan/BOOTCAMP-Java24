(function () {
    'use strict';
  
    const forms = document.querySelectorAll<HTMLFormElement>('.needs-validation');
  
    Array.prototype.slice.call(forms)
      .forEach(function (form) {
        form.addEventListener('submit', function (event: Event) {
          if (!(form as HTMLFormElement).checkValidity()) {
            event.preventDefault();
            event.stopPropagation();
          }
  
          form.classList.add('was-validated');
        }, false);
      });
})();
