# Homework 5 Solution

## Proxy
### What problem did I solve?

It would be difficult for us to keep thousands of markers (hospitals, restaurants, gas stations) in memory if we created new styles for them each time — this would mean drawing the same icons over again, wasting a lot of paper and time. With the Lightweight pattern, we made it so that the same styles (for example, red for hospitals or yellow for restaurants) are created only once and reused. This saves space on the computer, and the map works faster.

### How did this simplify or improve the program?

MarkerFactory makes sure that there are no extra copies of styles, and gives ready-made ones when they are needed. For example, all hospitals use one red style, and not a million different ones. Plus, we separated common things (icon type and color) from unique ones (marker name and location), which makes the code clearer. At the end of the program, you can see that with 5 markers there are only 3 styles, which proves that we were able to save memory and make everything simpler.

## Flyweight

### What problem did I solve?

If there are a lot of markers on the map — hospitals, restaurants, gas stations — and making a style for each would be very difficult for the computer in terms of memory. So I decided to do it this way: I took one style for all similar places, for example, red for hospitals, and use it many times. To some extent, we decided to make the same shell for similar things, while its unique data such as location would be different.

### How did this make the program better?

The factory in the code monitors that there are few styles, and gives ready-made ones when they are needed. For example, all restaurants share one yellow style, and do not multiply copies. We divided them, and it turns out that for the computer this saves a lot of time on creating and storing identical things that could be issued by similar features. As a result, 5 markers, and only 3 styles — this shows how we saved space and helped not only ourselves, but also future programmers who may also work on this data.

Made by a 2nd year student majoring in digital engineering Akhmetova Aisha.
