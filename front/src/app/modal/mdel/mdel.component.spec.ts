import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdelComponent } from './mdel.component';

describe('MdelComponent', () => {
  let component: MdelComponent;
  let fixture: ComponentFixture<MdelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MdelComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MdelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
