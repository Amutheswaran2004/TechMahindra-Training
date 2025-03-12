// job-detail.component.ts
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { JobService } from '../../services/job.service';
import { Job } from '../../models/job.model';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-job-detail',
  templateUrl: './job-detail.component.html',
  styleUrls: ['./job-detail.component.css']
})
export class JobDetailComponent implements OnInit {
  job!: Job;
  applyForm!: FormGroup;
  submitted: boolean = false;

  constructor(
    private route: ActivatedRoute,
    private jobService: JobService,
    private fb: FormBuilder
  ) {}

  ngOnInit(): void {
    const jobId = Number(this.route.snapshot.paramMap.get('id'));
    this.jobService.getJob(jobId).subscribe(data => {
      this.job = data;
    });

    // Initialize the Reactive Form
    this.applyForm = this.fb.group({
      fullName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      resume: ['', Validators.required]
    });
  }

  onSubmit(): void {
    this.submitted = true;
    if (this.applyForm.valid) {
      // Call the submitApplication method and subscribe to the response
      this.jobService.submitApplication(this.applyForm.value).subscribe(
        (response) => {
          console.log('Application submitted successfully', response);
          alert('Application Submitted');
        },
        (error) => {
          console.error('Error submitting application', error);
          alert('There was an error submitting your application.');
        }
      );
    }
  }
}
