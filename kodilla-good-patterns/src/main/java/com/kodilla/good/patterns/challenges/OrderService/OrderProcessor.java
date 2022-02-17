package com.kodilla.good.patterns.challenges.OrderService;

public class OrderProcessor {

        private InformationService informationService;
        private OrderService orderService;
        private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderRepository getOrderRepository() {

    return orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
            boolean isOrdered = orderService.order(orderRequest);


            if (isOrdered) {
                informationService.sendMessage(orderRequest.getUser());
                orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
                return new OrderDto(orderRequest.getUser(), true);
            } else {
                return new OrderDto(orderRequest.getUser(), false);
            }
        }
    }

