function mudar() {
        const image = document.querySelector('img');

        if (image.getAttribute('src') == 'https://devsprouthosting.com/images/egg.jpg') {
          image.setAttribute('src', 'https://devsprouthosting.com/images/chicken.jpg');
        } else {
          image.setAttribute('src', 'https://devsprouthosting.com/images/egg.jpg');
        }
      }

