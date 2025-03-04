document.addEventListener("DOMContentLoaded", function () {
  const reviewsContainer = document.getElementById("reviews");

  if (reviewsContainer) {
    let reviews = JSON.parse(localStorage.getItem("movieReviews")) || [];

    if (reviews.length === 0) {
      reviewsContainer.innerHTML =
        '<p class="text-center">No reviews yet. Add some on the homepage!</p>';
    } else {
      reviewsContainer.innerHTML = "";
      reviews.forEach((review, index) => {
        let reviewElement = document.createElement("div");
        reviewElement.classList.add("col-md-6", "col-lg-4", "mb-4");
        reviewElement.innerHTML = `
                    <div class="card shadow-lg">
                        <div class="card-body">
                            <h5 class="card-title text-primary">${review.movie}</h5>
                            <p class="card-text">${review.review}</p>
                            <button class="btn btn-danger btn-sm" onclick="deleteReview(${index})">Delete</button>
                        </div>
                    </div>
                `;
        reviewsContainer.appendChild(reviewElement);
      });
    }
  }
});

// Function to delete a review
function deleteReview(index) {
  let reviews = JSON.parse(localStorage.getItem("movieReviews")) || [];
  reviews.splice(index, 1);
  localStorage.setItem("movieReviews", JSON.stringify(reviews));
  location.reload();
}
