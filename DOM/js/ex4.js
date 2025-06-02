function mudar() {
        const image = document.querySelector('img');
        const currentSrc = image.getAttribute('src');

        if (currentSrc.includes('egg.jpg')) {
          image.setAttribute('src', 'https://devsprouthosting.com/images/chicken.jpg');
        } else {
          image.setAttribute('src', 'https://devsprouthosting.com/images/egg.jpg');
        }
      }

