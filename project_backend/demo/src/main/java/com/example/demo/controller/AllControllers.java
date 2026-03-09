/**
 * Clasa Controller servește ca punct de legătură între utilizatori și logica aplicației.
 * Este utilizata pentru comunicarea dintre Backend si Frontend
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
    package com.example.demo.controller;

    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;

    import java.util.Optional;
    import com.example.demo.entity.*;
    import com.example.demo.service.*;
    import com.example.demo.dto.*;
    import org.springframework.web.bind.annotation.RequestBody;


    import org.springframework.http.ResponseEntity;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.bind.annotation.DeleteMapping;



    import java.util.List;

    @RestController
    @RequestMapping("/")
    public class AllControllers {

        // Autowire the service class for Atractii
        @Autowired
        private AtractiiService atractiiService;

        // API endpoint to get attractions sorted by name
            @GetMapping("/attractions")
        public List<AtractiiDTO> getAllAttractions() {
            return atractiiService.getAllAttractions();
        }

        @Autowired
        private TransportService transportService;

        // API endpoint to retrieve all transport data
        @GetMapping("/transports")
        public List<Transport> getAllTransports() {
            return transportService.getAllTransports();
            // You can add more endpoints for other entities (Excursionisti, Transport, etc.)
        }

        @Autowired
        private ExcursionistiService excursionistiService;

        @GetMapping("/api")
        public List<ExcursionistiDetailsDTO> getExcursionistiDetails() {
            return excursionistiService.getExcursionistiDetails();
        }

        @Autowired
        private eventsService eventService;

        // Get all events with their attractions
        @GetMapping("/events")
        public List<eventDTO> getAllEventsWithAttractions() {
            return eventService.getAllEventsWithAttractions();
        }
        @Autowired
        private EventService eventtService;

        @GetMapping("/events-show")
        public Map<String, List<EventResponseDTO>> getEventsByCategory() {
            return eventtService.getEventsByCategory();
        }
        @Autowired
        private ExcursionistService excursionistService;

        @GetMapping("/excursionisti")
        public List<ExcursionistDTO> getAllExcursionists() {
            return excursionistService.getAllExcursionists();
        }
        @Autowired
        private OrganizatoriService organizatoriService;

        @GetMapping("/angajati")
        public List<AngajatDTO> getAngajati() {
            return organizatoriService.getAllAngajati();
        }

        @Autowired
        private OrganizatoriService2 organizatoriService2;

        @GetMapping("/organizatori")
        public OrganizatoriAndEventsDTO getOrganizatoriAndEvents() {
            return organizatoriService2.getOrganizatoriAndEvents();
        }
        @Autowired
        private LoginService loginService;
        ///1
        @GetMapping("/login")
        public List<LoginDTO> getLoginDetails() {
            return loginService.getLoginDetails();
        }
        @Autowired
        private CumparaBileteService eventServicecb;

        // Endpoint for getting event details by event ID
        @GetMapping("/cumpara-bilete")
        public ResponseEntity<Object> getEventDetails(@RequestParam("id") Long eventId) {
            if (eventId == null) {
                return ResponseEntity.badRequest().body("Event ID is required");
            }

            Optional<Evenimente> event = eventServicecb.getEventDetails(eventId);

            if (event.isPresent()) {
                return ResponseEntity.ok(event.get());  // Return the event details if found
            } else {
                return ResponseEntity.notFound().build();  // Return 404 if event not found
            }
        }
        @Autowired
        private UpdateUserService updateService;

        @PostMapping("/updateUser")
        public String updateUser(@RequestBody UpdateUserRequest request) {
            int updatedRows = updateService.updateUser(
                    request.getNumeComplet(),
                    request.getParola(),
                    request.getNrExcursii(),
                    request.getBaniCheltuiti()
            );

            return updatedRows > 0 ? "User data updated successfully" : "User not found or no changes made";
        }
        //DTO for the body
        public static class UpdateUserRequest {
            private String numeComplet;
            private String parola;
            private int nrExcursii;
            private double baniCheltuiti;

            // Getters and Setters
            public String getNumeComplet() {
                return numeComplet;
            }

            public void setNumeComplet(String numeComplet) {
                this.numeComplet = numeComplet;
            }

            public String getParola() {
                return parola;
            }

            public void setParola(String parola) {
                this.parola = parola;
            }

            public int getNrExcursii() {
                return nrExcursii;
            }

            public void setNrExcursii(int nrExcursii) {
                this.nrExcursii = nrExcursii;
            }

            public double getBaniCheltuiti() {
                return baniCheltuiti;
            }

            public void setBaniCheltuiti(double baniCheltuiti) {
                this.baniCheltuiti = baniCheltuiti;
            }
        }
        @Autowired
        private EventsDeleteService eventsDeleteService;

        @PostMapping("/events-delete")
        public ResponseEntity<String> deleteEvent(@RequestBody DeleteEventRequest request) {
            if (request.getId() == null) {
                return ResponseEntity.badRequest().body("ID is required");
            }

            boolean deleted = eventsDeleteService.deleteEvent(request.getId());
            if (deleted) {
                return ResponseEntity.ok("Event deleted successfully");
            } else {
                return ResponseEntity.status(404).body("Event not found");
            }
        }

        // DTO for request body
        public static class DeleteEventRequest {
            private Integer id;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }
        }
        @Autowired
        private AttractionsDeleteService attractionsDeleteService;

        @PostMapping("/attractions-delete")
        public ResponseEntity<String> deleteAttraction(@RequestBody DeleteAttractionRequest request) {
            if (request.getId() == null) {
                return ResponseEntity.badRequest().body("ID is required");
            }

            boolean deleted = attractionsDeleteService.deleteAttraction(request.getId());
            if (deleted) {
                return ResponseEntity.ok("Attraction deleted successfully");
            } else {
                return ResponseEntity.status(404).body("Attraction not found");
            }
        }

        // DTO for request body
        public static class DeleteAttractionRequest {
            private Integer id;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }
        }
        @Autowired
        private CreateEventService createEventService;

        @PostMapping("/createEvent")
        public ResponseEntity<String> createEvent(@RequestBody CreateEventRequestDTO request) {
            try {
                // Create and save the event
                Evenimente event = new Evenimente();
                event.setTransport_Id(request.getTransportId());
                event.setData_Inceput(request.getStartDateTime());
                event.setData_Final(request.getEndDateTime());
                event.setDescriere(request.getDescription());
                    event.setPret(request.getPrice().intValue());
                event.setNume_eveniment(request.getEventName());
                event.setOcupat(0);

                createEventService.createEvent(event, request.getAttractions());
                return ResponseEntity.ok("Event and attractions added successfully");
            } catch (Exception e) {
                return ResponseEntity.status(500).body("Failed to create event: " + e.getMessage());
            }
        }
        @Autowired
        private AttractionService attractionService;

        @PostMapping("/createAttraction")
        public ResponseEntity<String> createAttraction(@RequestBody CreateAttractionDTO dto) {
            if (dto.getName() == null || dto.getDescription() == null || dto.getImageUrl() == null) {
                return ResponseEntity.badRequest().body("All fields are required.");
            }

            try {
                attractionService.createAttraction(dto);
                return ResponseEntity.status(201).body("Attraction created successfully!");
            } catch (Exception e) {
                return ResponseEntity.status(500).body("Internal server error.");
            }
        }
        @Autowired
        private UpdateEventService updateeventService;

        @PostMapping("/update-occupancy")
        public ResponseEntity<String> updateOccupancy(@RequestBody UpdateOccupancyDTO updateOccupancyDTO) {
            try {
                String responseMessage = updateeventService.updateEventOccupancy(updateOccupancyDTO);
                return ResponseEntity.ok(responseMessage);
            } catch (IllegalArgumentException e) {
                return ResponseEntity.status(404).body(e.getMessage());
            } catch (Exception e) {
                return ResponseEntity.status(500).body("Error updating event occupancy: " + e.getMessage());
            }
        }
        @Autowired
        private AccountService accountService;

        @PostMapping("/createAccount")
        public ResponseEntity<String> createAccount(@RequestBody CreateAccountRequestDTO request) {
            try {
                String message = accountService.createAccount(request);
                return ResponseEntity.ok(message);
            } catch (Exception e) {
                return ResponseEntity.status(500).body("Failed to create account: " + e.getMessage());
            }
        }
        private CreateAngajatService createAngajatService;

        @PostMapping("/createAngajat")
        public ResponseEntity<String> createAngajat(@RequestBody CreateAngajatRequestDTO requestDTO) {
            try {
                createAngajatService.createAngajat(requestDTO);
                return ResponseEntity.ok("Angajat created successfully");
            } catch (Exception e) {
                return ResponseEntity.status(500).body("Error creating angajat: " + e.getMessage());
            }
        }
        private PurchaseService purchaseService2;

        @PostMapping("/createPurchase")
        public ResponseEntity<String> createPurchase(@RequestBody CreatePurchaseRequestDTO request) {
            String responseMessage = purchaseService2.createOrUpdatePurchase(request);
            return ResponseEntity.ok(responseMessage);
        }
        @Autowired
        private ExcursionistServices excursionistServicee2;

        @DeleteMapping("/deleteExcursionist")
        public ResponseEntity<String> deleteExcursionist(@RequestParam("id") int excursionistId) {

            boolean isDeleted = excursionistServicee2.deleteExcursionist(excursionistId);
            if (isDeleted) {
                return ResponseEntity.ok("Excursionist deleted successfully");
            } else {
                return ResponseEntity.status(404).body("Excursionist not found");
            }
        }
        @Autowired
        private OrganizatoriServices organizatoriServices;

        @DeleteMapping("/deleteOrganizatori")
        public ResponseEntity<String> deleteOrganizatori(@RequestParam("id") int organizatorId) {
            boolean isDeleted = organizatoriServices.deleteOrganizatori(organizatorId);
            if (isDeleted) {
                return ResponseEntity.ok("Organizator deleted successfully");
            } else {
                return ResponseEntity.status(404).body("Organizator not found");
            }
        }
        @Autowired
        private OrganizatoriUpdateService organizatori2Service;

        @PostMapping("/update-salary")
        public ResponseEntity<String> updateSalary(@RequestBody UpdateSalaryRequest request) {
            try {
                boolean isUpdated = organizatori2Service.updateSalary(request.getId(), request.getSalariu());
                if (isUpdated) {
                    return ResponseEntity.ok("Salary updated successfully");
                } else {
                    return ResponseEntity.status(404).body("Organizator not found");
                }
            } catch (Exception e) {
                return ResponseEntity.status(500).body("Error updating salary: " + e.getMessage());
            }
        }

        // DTO for request body
        public static class UpdateSalaryRequest {
            private Long id;
            private Double salariu;

            public Long getId() {
                return id;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public Double getSalariu() {
                return salariu;
            }

            public void setSalariu(Double salariu) {
                this.salariu = salariu;
            }
        }
        @Autowired
        private CopyEventService  eventcopyService;

        @PostMapping("/copy-event")
        public ResponseEntity<?> copyEvent(@RequestBody CopyEventRequest request) {
            try {
                if (request.getId() == null || request.getStartDatetime() == null || request.getEndDatetime() == null) {
                    return ResponseEntity.badRequest().body("Event ID, startDatetime, and endDatetime are required");
                }

                CopyEventResponseDTO response = eventcopyService.copyEvent(
                        request.getId(),
                        request.getStartDatetime(),
                        request.getEndDatetime()
                );

                return ResponseEntity.ok(response);
            } catch (Exception e) {
                return ResponseEntity.status(500).body("Error copying event: " + e.getMessage());
            }
        }

        // DTO for the request
        public static class CopyEventRequest {
            private Long id;
            private String startDatetime;
            private String endDatetime;

            public Long getId() {
                return id;
            }

            public void setId(Long id) {
                this.id = id;
            }

            public String getStartDatetime() {
                return startDatetime;
            }

            public void setStartDatetime(String startDatetime) {
                this.startDatetime = startDatetime;
            }

            public String getEndDatetime() {
                return endDatetime;
            }

            public void setEndDatetime(String endDatetime) {
                this.endDatetime = endDatetime;
            }
        }

        // DTO for the response
        public static class CopyEventResponse {
            private Long newEventId;
            private int copiedRows;

            public CopyEventResponse(Long newEventId, int copiedRows) {
                this.newEventId = newEventId;
                this.copiedRows = copiedRows;
            }

            public Long getNewEventId() {
                return newEventId;
            }

            public int getCopiedRows() {
                return copiedRows;
            }
        }
        private  ChangeOrgEventService changeOrgEventService;



        @PostMapping
        public ResponseEntity<?> updateEventOrganizers(
                @RequestParam("id") Long eventId,
                @RequestBody List<Long> selectedOrganizers) {

            if (eventId == null || selectedOrganizers == null || selectedOrganizers.isEmpty()) {
                return ResponseEntity.badRequest().body("Event ID and selectedOrganizers (array of IDs) are required");
            }

            try {
                int deletedRows = changeOrgEventService.deleteEventOrganizers(eventId);
                int insertedRows = changeOrgEventService.insertEventOrganizers(eventId, selectedOrganizers);
                return ResponseEntity.ok("Organizers successfully updated for event. Deleted Rows: " + deletedRows + ", Inserted Rows: " + insertedRows);
            } catch (Exception e) {
                return ResponseEntity.status(500).body("Error updating event organizers: " + e.getMessage());
            }
        }
    }