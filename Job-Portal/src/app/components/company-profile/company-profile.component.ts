import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { JobService } from '../../services/job.service';
import { Company } from '../../models/company.model';

@Component({
  selector: 'app-company-profile',
  templateUrl: './company-profile.component.html',
  styleUrls: ['./company-profile.component.css']
})
export class CompanyProfileComponent implements OnInit {
  company!: Company; // Holds company details

  constructor(
    private route: ActivatedRoute,
    private jobService: JobService
  ) {}

  ngOnInit(): void {
    // Get the company id from the URL and fetch data
    const companyId = Number(this.route.snapshot.paramMap.get('id'));
    this.jobService.getCompany(companyId).subscribe(data => {
      this.company = data;
    });
  }
}
