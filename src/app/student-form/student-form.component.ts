import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormBuilder, Validators, ReactiveFormsModule, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-student-form',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './student-form.component.html',
  styleUrls: ['./student-form.component.css']
})
export class StudentFormComponent {

  registrationForm!: FormGroup;   // ✅ Declare first

  submittedData: any = null;

  constructor(private fb: FormBuilder) {
    // ✅ Initialize inside constructor
    this.registrationForm = this.fb.group({
      fullname: ['', [Validators.required, Validators.minLength(3)]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern(/^\d{10}$/)]],
      gender: ['', Validators.required],
      course: ['', Validators.required],
      address: ['']
    });
  }

  submitForm() {
    if (this.registrationForm.valid) {
      this.submittedData = this.registrationForm.value;
    }
  }

  resetForm() {
    this.registrationForm.reset();
    this.submittedData = null;
  }
}
