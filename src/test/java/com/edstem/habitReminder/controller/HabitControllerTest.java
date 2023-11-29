package com.edstem.habitReminder.controller;

import com.edstem.habitReminder.service.HabitService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {HabitController.class})
@ExtendWith(SpringExtension.class)
@SpringBootTest
class HabitControllerTest {
    @Autowired private HabitController habitController;

    @MockBean private HabitService habitService;

    //    @Test
    //    void testCreateHabit() {
    //        CreateHabitRequest createHabitRequest = new CreateHabitRequest();
    //        createHabitRequest.setName("Exercise");
    //        createHabitRequest.setDescription("Daily workout");
    //        createHabitRequest.setReminderTime("08:00");
    //        createHabitRequest.setInterval(null);
    //        createHabitRequest.setEndDate(new Date());
    //
    //        Habit createdHabit = new Habit();
    //        createdHabit.setHabitId(1L);
    //        createdHabit.setName(createHabitRequest.getName());
    //        createdHabit.setDescription(createHabitRequest.getDescription());
    //        createdHabit.setReminderTime(createHabitRequest.getReminderTime());
    //        createdHabit.setEndDate(createHabitRequest.getEndDate());
    //        when(habitService.createHabit(createHabitRequest)).thenReturn(createdHabit);
    //        ResponseEntity<Habit> responseEntity =
    // habitController.createHabit(createHabitRequest);
    //        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
    //        assertEquals(createdHabit, responseEntity.getBody());
    //        verify(habitService, Mockito.times(1)).createHabit(createHabitRequest);
    //    }
    //
    //    @Test
    //    void getAllHabits_ReturnsPageOfHabits() {
    //
    //        List<Habit> habits = Arrays.asList(new Habit(), new Habit());
    //        Page<Habit> habitPage = new PageImpl<>(habits);
    //        when(habitService.getAllHabits(0, 10)).thenReturn(habitPage);
    //        ResponseEntity<Page<Habit>> result = habitController.getAllHabits(0, 10);
    //        assertEquals(HttpStatus.OK, result.getStatusCode());
    //        assertEquals(habitPage, result.getBody());
    //    }
    //
    //    @Test
    //    void testEditHabit_shouldReturnOkWhenEditedSuccessfully() {
    //        Long habitId = 1L;
    //        CreateHabitRequest editHabitRequest = new CreateHabitRequest();
    //        editHabitRequest.setName("New Name");
    //        editHabitRequest.setDescription("Updated description");
    //        doNothing().when(habitService).editHabit(habitId, editHabitRequest);
    //        ResponseEntity<String> responseEntity =
    //                habitController.editHabit(habitId, editHabitRequest);
    //        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    //        assertEquals("Habit updated successfully", responseEntity.getBody());
    //        Mockito.verify(habitService, Mockito.times(1)).editHabit(habitId, editHabitRequest);
    //    }
    //
    //    @Test
    //    void testEditHabit_shouldReturnInternalServerErrorOnError() {
    //        Long habitId = 1L;
    //        CreateHabitRequest editHabitRequest = new CreateHabitRequest();
    //        editHabitRequest.setName("New Name");
    //        editHabitRequest.setDescription("Updated description");
    //        doThrow(new RuntimeException("Simulated error"))
    //                .when(habitService)
    //                .editHabit(habitId, editHabitRequest);
    //        ResponseEntity<String> responseEntity =
    //                habitController.editHabit(habitId, editHabitRequest);
    //        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, responseEntity.getStatusCode());
    //        assertEquals("Error updating habit", responseEntity.getBody());
    //        Mockito.verify(habitService, Mockito.times(1)).editHabit(habitId, editHabitRequest);
    //    }
    //
    //    @Test
    //    void testDeleteHabitById() {
    //        Long habitId = 1L;
    //        doNothing().when(habitService).deleteHabitById(habitId);
    //        ResponseEntity<String> responseEntity = habitController.deleteHabitById(habitId);
    //        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    //        assertEquals("Habit with ID 1 has been deleted", responseEntity.getBody());
    //        Mockito.verify(habitService, Mockito.times(1)).deleteHabitById(habitId);
    //    }
}
