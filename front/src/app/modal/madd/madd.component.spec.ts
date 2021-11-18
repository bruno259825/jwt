import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MaddComponent } from './madd.component';

describe('MaddComponent', () => {
  let component: MaddComponent;
  let fixture: ComponentFixture<MaddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MaddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MaddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
