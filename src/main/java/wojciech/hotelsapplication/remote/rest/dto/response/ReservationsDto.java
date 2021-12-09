package wojciech.hotelsapplication.remote.rest.dto.response;

import wojciech.hotelsapplication.remote.rest.dto.request.HotelsDto;
import wojciech.hotelsapplication.remote.rest.dto.request.PersonDto;

public class ReservationsDto {
    private Integer id;
    private String status;
    private HotelsDto rooms;
    private PersonDto person;

    public ReservationsDto() {
    }

    public ReservationsDto(Integer id, String status, HotelsDto rooms, PersonDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HotelsDto getRooms() {
        return rooms;
    }

    public void setRooms(HotelsDto rooms) {
        this.rooms = rooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
