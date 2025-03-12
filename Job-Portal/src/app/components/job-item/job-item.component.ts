import { Component, Input } from '@angular/core';
import { Job } from '../../models/job.model';

@Component({
  selector: 'app-job-item',
  templateUrl: './job-item.component.html',
  styleUrls: ['./job-item.component.css']
})
export class JobItemComponent {
  @Input() job!: Job; // Receives job data from the parent
}
