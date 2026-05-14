# Earthquake Alert System

A near real-time seismic monitoring and probabilistic prediction platform that integrates live earthquake data with an AI-based alert engine to forecast potential seismic activity across 196 countries within a 24–72 hour window.

---

## Overview

The Earthquake Alert System was developed as a major academic project for CAP477: Programming in Java at Lovely Professional University. The system combines real-time seismic data ingestion with predictive analytics to extend beyond conventional earthquake detection systems.

Traditional systems are primarily reactive, reporting seismic events after they occur. In contrast, this project adopts a proactive approach by applying geospatial clustering, historical pattern analysis, and heuristic machine-learning-inspired techniques to generate probabilistic forecasts. The objective is to provide early risk awareness and support better preparedness.

---

## Objectives

* Develop a near real-time dashboard for monitoring live earthquake data using the USGS GeoJSON API
* Design and implement an alert engine capable of generating 24–72 hour seismic predictions
* Apply geospatial clustering and historical pattern analysis for forecasting
* Build an interactive world map with magnitude-based visualization
* Enable browser-based notifications for high-risk predictions
* Support country-level filtering across 196 monitored regions
* Maintain continuous updates through automated refresh cycles
* Provide a structured forecast table with confidence scores and risk levels

---

## System Architecture

USGS API → Spring Boot Backend → Alert Engine → REST API → Frontend (Leaflet.js)

* Data Source: USGS Earthquake Feed (GeoJSON)
* Processing Layer: Clustering and forecasting logic
* Backend: API services and prediction engine
* Frontend: Visualization, filtering, and alert display

---

## Tech Stack

### Backend

* Java 17
* Spring Boot 3.2.5
* Spring WebFlux (Reactive WebClient)
* RestTemplate
* Jackson (JSON processing)
* Maven

### Frontend

* HTML, CSS, JavaScript
* Leaflet.js for map visualization
* Web Notifications API

### Core Concepts

* Geospatial clustering
* Heuristic AI models
* Time-series pattern analysis
* REST API design
* Reactive programming

---

## Features

### Real-Time Monitoring

* Continuous polling of the USGS API
* Live visualization of earthquake data

### Predictive Alert Engine

* Probabilistic forecasts within a 24–72 hour window
* Confidence-based prediction scoring

### Interactive Map

* Magnitude-based color markers:

  * Low (M < 4.5)
  * Moderate (4.5–5.9)
  * Severe (≥ 6.0)
* Seismic heatmap overlays

### Notifications

* Browser-based alerts for high-magnitude predictions (M ≥ 7.0)
* Includes location, magnitude, predicted time, and confidence score

### Filtering and Controls

* Country-level filtering and zoom
* Magnitude slider (≥1.0 to ≥9.0)
* Auto-refresh every 30 seconds with live countdown
* Dark and light mode support

### Forecast Table

* Predicted magnitude
* Expected epicenter
* Country
* Alert window
* Confidence percentage
* Risk level classification

---

## Project Structure

```
earthquake-alert-system/
│
├── backend/
├── frontend/
├── data-processing/
├── docs/
├── .gitignore
├── README.md
└── pom.xml
```

---

## How to Run

### Clone Repository

```bash
git clone https://github.com/your-username/earthquake-alert-system.git
cd earthquake-alert-system
```

### Run Backend

```bash
cd backend
mvn spring-boot:run
```

### Run Frontend

```bash
cd frontend
open index.html
```

---

## API Integration

* Source: USGS Earthquake Feed API
* Format: GeoJSON

The API provides:

* Magnitude
* Location
* Depth
* Timestamp

---

## Prediction Methodology

The system uses a hybrid heuristic approach combining:

* Geospatial clustering of recent seismic events
* Historical pattern correlation
* Magnitude-frequency distribution analysis
* Temporal trend evaluation

The output includes:

* Predicted region
* Expected magnitude range
* Time window (24–72 hours)
* Confidence score

---

## Limitations

* Predictions are probabilistic and not guaranteed
* Dependent on availability and accuracy of external USGS data
* Heuristic models are less precise than advanced deep learning approaches

---

## Future Enhancements

* Integration of deep learning models (LSTM, RNN)
* Multi-source seismic data integration
* Mobile application support
* Cloud deployment (AWS, Kubernetes)
* Real-time streaming using Kafka or WebSockets

---

## Team

* Sanyam Jain
* Harsh Prasad
* Amit Kumar
* Rajib Kumar Dhara

**Supervisor:**
Dr. (Prof.) Anil Sharma

---

## Academic Context

* Course: CAP477 – Programming in Java
* Program: MCA (Hons.) AI & Machine Learning
* Institution: Lovely Professional University
* Semester: 1st Year, 2nd Semester

---

## License

This project is developed for academic purposes. A formal license can be added for future use.

---

## Conclusion

The Earthquake Alert System demonstrates the application of Java, reactive systems, and heuristic AI techniques in building a scalable and near real-time predictive platform. It highlights the transition from passive monitoring to early-stage forecasting, forming a base for further advancements in disaster prediction systems.
