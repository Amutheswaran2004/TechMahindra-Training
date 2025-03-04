document.addEventListener("DOMContentLoaded", () => {
  const movieList = document.getElementById("movieList");

  const movies = [
    {
      title: "Thillana Mohanambal",
      year: 1968,
      poster:
        "https://m.media-amazon.com/images/M/MV5BYzY2NmEwM2MtYjJlYy00NmI5LWJkZTAtNjZhMjVlNTZhYzY5XkEyXkFqcGc@._V1_QL75_UX241.5_.jpg",
    },
    {
      title: "Enga Veettu Pillai",
      year: 1965,
      poster:
        "https://m.media-amazon.com/images/M/MV5BY2YxYTQ2MDItYTQ5Ny00Y2UzLTgwODgtZmYxOGFjYzRjYjAzXkEyXkFqcGc@._V1_.jpg",
    },
    {
      title: "Vikram",
      year: 1986,
      poster:
        "https://images.plex.tv/photo?size=large-1920&scale=1&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2FzMgY2Cbu6KZBNOh3QSm5yY2hkgA.jpg",
    },
    {
      title: "Thalapathi",
      year: 1991,
      poster:
        "data:image/jpeg;base64,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",
    },
    {
      title: "Anbe Sivam",
      year: 2003,

      poster:
        "https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/p10986261_p_v8_aa.jpg",
    },
    {
      title: "Joker",
      year: 2024,
      poster:
        "https://substackcdn.com/image/fetch/f_auto,q_auto:good,fl_progressive:steep/https%3A%2F%2Fsubstack-post-media.s3.amazonaws.com%2Fpublic%2Fimages%2F15c13f1b-334e-48ab-b8ba-7bd6fa7462de_1638x2048.jpeg",
    },
    {
      title: "Jurasik World",
      year: 1993,

      poster:
        "https://fastfilmreviews.com/wp-content/uploads/2018/06/jurassic_world_fallen_kingdom_ver7-1.jpg",
    },
  ];

  function displayMovies() {
    movieList.innerHTML = "";
    movies.forEach((movie) => {
      const movieCard = `
                <div class="col-md-4">
                    <div class="card mb-4">
                        <img src="${movie.poster}" class="card-img-top" alt="${movie.title}" style="height: 400px;widht: 150px;>
                        <div class="card-body">
                            <h5 class="card-title">${movie.title}</h5>
                            <p class="card-text">Released: ${movie.year}</p>
                            <button class="btn btn-primary">View Details</button>
                        </div>
                    </div>
                </div>
            `;
      movieList.innerHTML += movieCard;
    });
  }

  displayMovies();
});
