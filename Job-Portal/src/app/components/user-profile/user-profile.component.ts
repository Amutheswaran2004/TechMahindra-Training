import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserService } from '../../services/user.service';
import { User } from '../../models/user.model';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {
  user!: User;
  userForm!: FormGroup;
  editMode: boolean = false;
  submitted: boolean = false;

  constructor(
    private route: ActivatedRoute,
    private userService: UserService,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    // Retrieve user id from route parameters
    const userId = Number(this.route.snapshot.paramMap.get('id'));
    this.userService.getUser(userId).subscribe((data) => {
      this.user = data;
      this.initializeForm();
    });
  }

  // Initialize the Reactive Form with the user's current details
  initializeForm(): void {
    this.userForm = this.fb.group({
      name: [this.user.name, Validators.required],
      email: [this.user.email, [Validators.required, Validators.email]],
      resume: [this.user.resume, Validators.required]
      // Add additional fields here as needed.
    });
  }

  // Toggle between view and edit mode
  toggleEditMode(): void {
    this.editMode = !this.editMode;
    // If switching to edit mode, reinitialize the form to reflect current values
    if (this.editMode) {
      this.initializeForm();
    }
  }

  // Called when the user submits the edit form
  onSubmit(): void {
    this.submitted = true;
    if (this.userForm.valid) {
      // Call the update method in the service
      this.userService.updateUser(this.user.id, this.userForm.value).subscribe(
        (updatedUser) => {
          this.user = updatedUser;
          this.editMode = false;
          this.submitted = false;
          alert('Profile updated successfully.');
        },
        (error) => {
          console.error('Error updating profile:', error);
          alert('Error updating profile.');
        }
      );
    }
  }
}
