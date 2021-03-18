import org.junit.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class StackTest {

    @Test
    public void simpleTest() throws PushException {
        Stack aStack = new Stack();

        aStack.push(1);
    }

    @Test
    public void initialize_whenCustomConsrtuctor_createObject() throws PushException {
        Stack aStack = new Stack(10000);

        aStack.push(1);
    }

    @Test
    public void increase_whenDefaultStackIncreased_moreDataCanFitOnStack() throws PushException, PopException {
        Stack aStack = new Stack();

        aStack.increase();

        aStack.push(1);
        aStack.push(2);
        aStack.push(3);
        aStack.push(4);
        aStack.push(5);
        aStack.push(6);
        aStack.push(7);
        aStack.push(8);
        aStack.push(9);
        aStack.push(10);


        assertThat(aStack.pop()).isEqualTo(10);
        assertThat(aStack.pop()).isEqualTo(9);
        assertThat(aStack.pop()).isEqualTo(8);
        assertThat(aStack.pop()).isEqualTo(7);
        assertThat(aStack.pop()).isEqualTo(6);
        assertThat(aStack.pop()).isEqualTo(5);
        assertThat(aStack.pop()).isEqualTo(4);
        assertThat(aStack.pop()).isEqualTo(3);
        assertThat(aStack.pop()).isEqualTo(2);
        assertThat(aStack.pop()).isEqualTo(1);

    }

    @Test
    public void increase_whenDefaultStackIncreased_allExistingDataPreserved() throws PushException, PopException {
        Stack aStack = new Stack();

        aStack.push(1);
        aStack.push(2);
        aStack.push(3);
        aStack.push(4);
        aStack.push(5);

        aStack.increase();

        aStack.push(6);
        aStack.push(7);
        aStack.push(8);
        aStack.push(9);
        aStack.push(10);

        assertThat(aStack.pop()).isEqualTo(10);
        assertThat(aStack.pop()).isEqualTo(9);
        assertThat(aStack.pop()).isEqualTo(8);
        assertThat(aStack.pop()).isEqualTo(7);
        assertThat(aStack.pop()).isEqualTo(6);
        assertThat(aStack.pop()).isEqualTo(5);
        assertThat(aStack.pop()).isEqualTo(4);
        assertThat(aStack.pop()).isEqualTo(3);
        assertThat(aStack.pop()).isEqualTo(2);
        assertThat(aStack.pop()).isEqualTo(1);
    }

    @Test
    public void decrease_whenStorageHas10Data_cutOffExtraData() throws PushException, PopException {
        Stack stack = new Stack(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        stack.decrease();

        assertThat(stack.pop()).isEqualTo(10);
        assertThat(stack.pop()).isEqualTo(9);
        assertThat(stack.pop()).isEqualTo(8);
        assertThat(stack.pop()).isEqualTo(7);
        assertThat(stack.pop()).isEqualTo(6);

        assertThatThrownBy(() -> stack.pop()).isInstanceOf(PopException.class);
    }
}