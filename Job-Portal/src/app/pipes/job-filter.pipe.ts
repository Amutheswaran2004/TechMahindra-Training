import { Pipe, PipeTransform } from '@angular/core';
import { Job } from '../models/job.model'

@Pipe({
  name: 'jobFilter'
})
export class JobFilterPipe implements PipeTransform {
  // Filters jobs based on the search term provided
  transform(jobs: Job[], searchTerm: string): Job[] {
    if (!jobs || !searchTerm) {
      return jobs;
    }
    return jobs.filter(job =>
      job.title.toLowerCase().includes(searchTerm.toLowerCase())
    );
  }
}
