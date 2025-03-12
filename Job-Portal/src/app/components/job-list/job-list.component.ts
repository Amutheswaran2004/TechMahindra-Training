import { Component, OnInit } from '@angular/core';
import { JobService } from '../../services/job.service';
import { Job } from '../../models/job.model';

@Component({
  selector: 'app-job-list',
  templateUrl: './job-list.component.html',
  styleUrls: ['./job-list.component.css']
})
export class JobListComponent implements OnInit {
  jobs: Job[] = []; // List of jobs fetched from the service
  searchTerm: string = ''; // Search term for filtering jobs

  constructor(private jobService: JobService) {}

  ngOnInit(): void {
    // Fetch job data from the API via the service
    this.jobService.getJobs().subscribe(data => {
      this.jobs = data;
    });
  }
}
